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
 * @param id
 * @param rev
 * @param deletionDate hard delete (unix epoch in ms) timestamp of the object. Filled automatically when deletePatient is called.
 * @param from
 * @param to
 * @param productId
 * @param code
 * @param name
 * @param noGenericPrescriptionReason
 * @param noSwitchReason
 */

data class VmpGroupDto (


    val id: kotlin.String,


    val rev: kotlin.String? = null,

    /* hard delete (unix epoch in ms) timestamp of the object. Filled automatically when deletePatient is called. */

    val deletionDate: kotlin.Long? = null,


    val from: kotlin.Long? = null,


    val to: kotlin.Long? = null,


    val productId: kotlin.String? = null,


    val code: kotlin.String? = null,


    val name: SamTextDto? = null,


    val noGenericPrescriptionReason: NoGenericPrescriptionReasonDto? = null,


    val noSwitchReason: NoSwitchReasonDto? = null

)

