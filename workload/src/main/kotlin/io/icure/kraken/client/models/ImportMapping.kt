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
 * @param label
 * @param tags
 * @param lifecycle
 * @param content
 * @param cdLocal
 */

data class ImportMapping (


    val label: kotlin.collections.Map<kotlin.String, kotlin.String> = emptyMap(),


    val tags: kotlin.collections.List<CodeStub> = emptyList(),


    val lifecycle: kotlin.String? = null,


    val content: kotlin.String? = null,


    val cdLocal: kotlin.String? = null

)

