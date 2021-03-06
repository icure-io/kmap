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
 * @param read
 * @param write
 * @param administration
 * @param userId
 */

data class RightDto (


    val read: kotlin.Boolean = false,


    val write: kotlin.Boolean = false,


    val administration: kotlin.Boolean = false,


    val userId: kotlin.String? = null

)

