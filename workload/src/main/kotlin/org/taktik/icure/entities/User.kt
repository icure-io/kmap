/*
 *  iCure Data Stack. Copyright (c) 2020 Taktik SA
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Affero General Public License as
 *     published by the Free Software Foundation, either version 3 of the
 *     License, or (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful, but
 *     WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *     Affero General Public License for more details.
 *
 *     You should have received a copy of the GNU Affero General Public
 *     License along with this program.  If not, see
 *     <https://www.gnu.org/licenses/>.
 */
package org.taktik.icure.entities

import org.taktik.icure.entities.base.PropertyStub
import org.taktik.icure.entities.base.StoredDocument
import org.taktik.icure.entities.embed.DelegationTag
import org.taktik.icure.entities.embed.RevisionInfo
import org.taktik.icure.entities.security.AuthenticationToken
import org.taktik.icure.entities.security.Permission
import org.taktik.icure.entities.security.Principal
import org.taktik.icure.entities.utils.MergeUtil.mergeMapsOfSetsDistinct
import org.taktik.icure.utils.DynamicInitializer
import org.taktik.icure.utils.invoke
import java.io.Serializable
import java.time.Instant


/**
 * A User
 * This entity is a root level object. It represents an user that can log in to the iCure platform. It is serialized in JSON and saved in the underlying icure-base CouchDB database.
 * A User conforms to a series of interfaces:
 * - StoredDocument
 * - Principal
 *
 * @property id the Id of the user. We encourage using either a v4 UUID or a HL7 Id.
 * @property rev the revision of the user in the database, used for conflict management / optimistic locking.
 * @property created the timestamp (unix epoch in ms) of creation of the user, will be filled automatically if missing. Not enforced by the application server.
 * @property deletionDate hard delete (unix epoch in ms) timestamp of the object. Filled automatically when user is deleted.
 * @property name Last name of the user. This is the official last name that should be used for official administrative purposes.
 * @property properties Extra properties for the user. Those properties are typed (see class Property)
 * @property roles Roles specified for the user
 * @property permissions If permission to modify patient data is granted or revoked
 * @property type Authorization source for user. 'Database', 'ldap' or 'token'
 * @property status State of user's activeness: 'Active', 'Disabled' or 'Registering'
 * @property login Username for this user. We encourage using an email address
 * @property passwordHash Hashed version of the password (BCrypt is used for hashing)
 * @property secret Secret token used to verify 2fa
 * @property use2fa Whether the user has activated two factors authentication
 * @property groupId id of the group (practice/hospital) the user is member of
 * @property healthcarePartyId Id of the healthcare party if the user is a healthcare party.
 * @property patientId Id of the patient if the user is a patient
 * @property autoDelegations Delegations that are automatically generated client side when a new database object is created by this user
 * @property createdDate the timestamp (unix epoch in ms) of creation of the user, will be filled automatically if missing. Not enforced by the application server.
 * @property lastLoginDate the timestamp (unix epoch in ms) of last login of the user.
 * @property termsOfUseDate the timestamp (unix epoch in ms) of the latest validation of the terms of use of the application
 * @property email email address of the user.
 * @property applicationTokens Deprecated : Use authenticationTokens instead - Long lived authentication tokens used for inter-applications authentication
 * @property authenticationTokens Encrypted and time-limited Authentication tokens used for inter-applications authentication
 */

data class User(
       override val id: String,
       override val rev: String? = null,
       override val deletionDate: Long? = null,
        val created: Long? = null,

        override val name: String? = null,
        override val properties: Set<PropertyStub> = emptySet(),
        val roles: Set<String> = emptySet(),
        override val permissions: Set<Permission> = emptySet(),
        val login: String? = null,
        val passwordHash: String? = null,
        val secret: String? = null,
        val use2fa: Boolean? = null,
        val groupId: String? = null,
        val healthcarePartyId: String? = null,
        val patientId: String? = null,
        val deviceId: String? = null,
        val autoDelegations: Map<DelegationTag, Set<String>> = emptyMap(), //DelegationTag -> healthcarePartyIds

        val createdDate: Instant? = null,


        val lastLoginDate: Instant? = null,


        val expirationDate: Instant? = null,


        val termsOfUseDate: Instant? = null,

        val email: String? = null,
        val mobilePhone: String? = null,

        @Deprecated("Application tokens stocked in clear and eternal. Replaced by authenticationTokens")
        val applicationTokens: Map<String, String>? = null,

        val authenticationTokens: Map<String, AuthenticationToken> = emptyMap(),

       override val revisionsInfo: List<RevisionInfo>? = emptyList(),
       override val conflicts: List<String>? = emptyList(),
       override val revHistory: Map<String, String>? = emptyMap(),

) : StoredDocument, Principal, Cloneable, Serializable {
    companion object : DynamicInitializer<User>

    fun merge(other: User) = User(args = this.solveConflictsWith(other))
    fun solveConflictsWith(other: User) = super.solveConflictsWith(other) + mapOf(
            "created" to (this.created?.coerceAtMost(other.created ?: Long.MAX_VALUE) ?: other.created),
            "name" to (this.name ?: other.name),
            "properties" to (other.properties + this.properties),
            "permissions" to (other.permissions + this.permissions),
            "login" to (this.login ?: other.login),
            "passwordHash" to (this.passwordHash ?: other.passwordHash),
            "secret" to (this.secret ?: other.secret),
            "isUse2fa" to (this.use2fa ?: other.use2fa),
            "groupId" to (this.groupId ?: other.groupId),
            "healthcarePartyId" to (this.healthcarePartyId ?: other.healthcarePartyId),
            "patientId" to (this.patientId ?: other.patientId),
            "autoDelegations" to mergeMapsOfSetsDistinct(this.autoDelegations, other.autoDelegations),
            "createdDate" to (this.createdDate ?: other.createdDate),
            "lastLoginDate" to (this.lastLoginDate ?: other.lastLoginDate),
            "expirationDate" to (this.expirationDate ?: other.expirationDate),
            "termsOfUseDate" to (this.termsOfUseDate ?: other.termsOfUseDate),
            "email" to (this.email ?: other.email),
            "applicationTokens" to (other.applicationTokens?.let { it + (this.applicationTokens ?: emptyMap()) } ?: this.applicationTokens),
            "authenticationTokens" to (other.authenticationTokens + this.authenticationTokens)
    )

    override fun withIdRev(id: String?, rev: String) = if (id != null) this.copy(id = id, rev = rev) else this.copy(rev = rev)
    override fun withDeletionDate(deletionDate: Long?) = this.copy(deletionDate = deletionDate)
    override fun getParents(): Set<String> = this.roles
}
