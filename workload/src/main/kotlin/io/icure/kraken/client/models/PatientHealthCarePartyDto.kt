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
 * One or several periods of care by an hcp for this patient
 *
 * @param sendFormats Preferred format of exchange for diverse means of communication
 * @param referralPeriods Time periods
 * @param referral
 * @param type Type of care/relationship.
 * @param healthcarePartyId UUID of the hcp.
 * @param encryptedSelf The base64 encoded data of this object, formatted as JSON and encrypted in AES using the random master key from encryptionKeys.
 */

data class PatientHealthCarePartyDto (

    /* Preferred format of exchange for diverse means of communication */
    
    val sendFormats: kotlin.collections.Map<kotlin.String, kotlin.String> = emptyMap(),

    /* Time periods */
    
    val referralPeriods: kotlin.collections.List<ReferralPeriodDto> = emptyList(),

    
    @Deprecated(message = "This property is deprecated.")
    val referral: kotlin.Boolean = false,

    /* Type of care/relationship. */
    
    val type: PatientHealthCarePartyDto.Type? = null,

    /* UUID of the hcp. */
    
    val healthcarePartyId: kotlin.String? = null,

    /* The base64 encoded data of this object, formatted as JSON and encrypted in AES using the random master key from encryptionKeys. */
    
    val encryptedSelf: kotlin.String? = null

) {

    /**
     * Type of care/relationship.
     *
     * Values: doctor,referral,medicalhouse,retirementhome,hospital,other,referringphysician,managingorganization
     */
    enum class Type(val value: kotlin.String) {
        doctor("doctor"),
        referral("referral"),
        medicalhouse("medicalhouse"),
        retirementhome("retirementhome"),
        hospital("hospital"),
        other("other"),
        referringphysician("referringphysician"),
        managingorganization("managingorganization");
    }
}

