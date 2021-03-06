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
 * @param successful
 * @param healthcarePartyId
 * @param reason
 * @param username
 */

data class AuthenticationResponse (


    val successful: kotlin.Boolean,


    val healthcarePartyId: kotlin.String? = null,


    val reason: kotlin.String? = null,


    val username: kotlin.String? = null

)

