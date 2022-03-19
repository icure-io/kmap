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
 *
 *
 * @param secretForeignKeys
 * @param services
 * @param serviceAuthors
 * @param recipient
 * @param comment
 */

data class MedicationSchemeExportInfoDto (


    val secretForeignKeys: kotlin.collections.List<kotlin.String> = emptyList(),


    val services: kotlin.collections.List<ServiceDto> = emptyList(),


    val serviceAuthors: kotlin.collections.List<HealthcarePartyDto>? = null,


    val recipient: HealthcarePartyDto? = null,


    val comment: kotlin.String? = null

)

