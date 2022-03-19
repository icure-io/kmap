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
 * @param form
 * @param sections
 * @param description
 * @param keywords
 */

data class FormTemplateLayout (


    val form: kotlin.String,


    val sections: kotlin.collections.List<Section> = emptyList(),


    val description: kotlin.String? = null,


    val keywords: kotlin.collections.List<kotlin.String>? = null

)

