/**
 * iCure Data Stack API Documentation
 *
 * The iCure Data Stack Application API is the native interface to iCure.
 *
 * The version of the OpenAPI document: v2
 *
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */
package io.icure.kraken.client.models

/**
 * List of care team members assigned for the healthcare element.
 *
 * @param id
 * @param careTeamMemberType
 * @param healthcarePartyId
 * @param quality
 * @param encryptedSelf The base64 encoded data of this object, formatted as JSON and encrypted in AES using the random master key from encryptionKeys.
 */

data class CareTeamMemberDto (


    val id: kotlin.String,


    val careTeamMemberType: CareTeamMemberDto.CareTeamMemberType? = null,


    val healthcarePartyId: kotlin.String? = null,


    val quality: CodeStubDto? = null,

    /* The base64 encoded data of this object, formatted as JSON and encrypted in AES using the random master key from encryptionKeys. */

    val encryptedSelf: kotlin.String? = null

) {

    /**
     *
     *
     * Values: physician,specialist,other
     */
    enum class CareTeamMemberType(val value: kotlin.String) {
        physician("physician"),
        specialist("specialist"),
        other("other");
    }
}

