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
package org.taktik.icure.services.external.rest.v1.dto.embed

/**
 * Services are created in the course a contact. Information like temperature, blood pressure and so on.
 */

import org.taktik.icure.services.external.rest.v1.dto.base.CodeStubDto
import org.taktik.icure.services.external.rest.v1.dto.base.ICureDocumentDto
import org.taktik.icure.services.external.rest.v1.dto.base.IdentifierDto
import org.taktik.icure.services.external.rest.v1.dto.base.LinkQualificationDto
import java.util.*

data class ServiceDto(
         override val id: String = UUID.randomUUID().toString(),
         val transactionId: String? = null,
        val identifier: List<IdentifierDto> = listOf(),
         val contactId: String? = null,
         val subContactIds: Set<String>? = null, //Only used when the ServiceDto is emitted outside of its contact
         val plansOfActionIds: Set<String>? = null, //Only used when the ServiceDto is emitted outside of its contact
         val healthElementsIds: Set<String>? = null, //Only used when the ServiceDto is emitted outside of its contact
         val formIds: Set<String>? = null, //Only used when the ServiceDto is emitted outside of its contact
         val secretForeignKeys: Set<String>? = emptySet(), //Only used when the ServiceDto is emitted outside of its contact
         val cryptedForeignKeys: Map<String, Set<DelegationDto>> = emptyMap(), //Only used when the ServiceDto is emitted outside of its contact
         val delegations: Map<String, Set<DelegationDto>> = emptyMap(), //Only used when the ServiceDto is emitted outside of its contact
         val encryptionKeys: Map<String, Set<DelegationDto>> = emptyMap(), //Only used when the ServiceDto is emitted outside of its contact
         val label: String? = null,
        @get:Deprecated("Deleted in next version") val dataClassName: String? = null,
         val index: Long? = null, //Used for sorting
         val content: Map<String, ContentDto> = emptyMap(), //Localized, in the case when the service contains a document, the document id is the SerializableValue
        @get:Deprecated("use encryptedSelf instead") val encryptedContent: String? = null, //Crypted (AES+base64) version of the above, deprecated, use encryptedSelf instead
        val textIndexes: Map<String, String> = emptyMap(), //Same structure as content but used for full text indexation
         val valueDate: Long? = null, // YYYYMMDDHHMMSS if unknown, 00, ex:20010800000000. Note that to avoid all confusion: 2015/01/02 00:00:00 is encoded as 20140101235960.
         val openingDate: Long? = null, // YYYYMMDDHHMMSS if unknown, 00, ex:20010800000000. Note that to avoid all confusion: 2015/01/02 00:00:00 is encoded as 20140101235960.
         val closingDate: Long? = null, // YYYYMMDDHHMMSS if unknown, 00, ex:20010800000000. Note that to avoid all confusion: 2015/01/02 00:00:00 is encoded as 20140101235960.
         val formId: String? = null, //Used to group logically related services
        override val created: Long? = null,
        override val modified: Long? = null,
        override val endOfLife: Long? = null,
        override val author: String? = null, //userId
        override val responsible: String? = null, //healthcarePartyId
        override val medicalLocationId: String? = null,
         val comment: String? = null,
        val status: Int? = null, //bit 0: active/inactive, bit 1: relevant/irrelevant, bit2 : present/absent, ex: 0 = active,relevant and present
         val invoicingCodes: Set<String> = emptySet(),
         val notes: List<AnnotationDto> = emptyList(),
         val qualifiedLinks: Map<LinkQualificationDto, Map<String, String>> = emptyMap(), //Links towards related services (possibly in other contacts)
        override val codes: Set<CodeStubDto> = emptySet(), //stub object of the CodeDto used to qualify the content of the ServiceDto
        override val tags: Set<CodeStubDto> = emptySet(), //stub object of the tag used to qualify the type of the ServiceDto
        override val encryptedSelf: String? = null
) : EncryptedDto, ICureDocumentDto<String>, Comparable<ServiceDto> {
    override fun compareTo(other: ServiceDto): Int {
        if (this == other) {
            return 0
        }
        var idx = if (index != null && other.index != null) index.compareTo(other.index) else 0
        if (idx != 0) return idx
        idx = id.compareTo(other.id)
        return if (idx != 0) idx else 1
    }
}
