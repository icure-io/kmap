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
 * @param firstName 
 * @param lastName 
 * @param emailAddress 
 * @param userOptions 
 */

data class RegistrationInformationDto (

    
    val firstName: kotlin.String,

    
    val lastName: kotlin.String,

    
    val emailAddress: kotlin.String,

    
    val userOptions: kotlin.String? = null

)

