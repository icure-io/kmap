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
 * @param pageSize
 * @param totalSize
 * @param rows
 * @param nextKeyPair
 */

data class PaginatedListHealthcarePartyDto (


    val pageSize: kotlin.Int,


    val totalSize: kotlin.Int,


    val rows: kotlin.collections.List<HealthcarePartyDto> = emptyList(),


    val nextKeyPair: PaginatedDocumentKeyIdPairObject? = null

)

