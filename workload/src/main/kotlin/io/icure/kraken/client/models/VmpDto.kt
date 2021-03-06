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
 * @param code
 * @param vmpGroup
 * @param name
 * @param abbreviation
 * @param vtm
 * @param wadas
 * @param components
 * @param commentedClassifications
 */

data class VmpDto (


    val id: kotlin.String,


    val rev: kotlin.String? = null,

    /* hard delete (unix epoch in ms) timestamp of the object. Filled automatically when deletePatient is called. */

    val deletionDate: kotlin.Long? = null,


    val from: kotlin.Long? = null,


    val to: kotlin.Long? = null,


    val code: kotlin.String? = null,


    val vmpGroup: VmpGroupStubDto? = null,


    val name: SamTextDto? = null,


    val abbreviation: SamTextDto? = null,


    val vtm: VtmDto? = null,


    val wadas: kotlin.collections.List<WadaDto>? = null,


    val components: kotlin.collections.List<VmpComponentDto>? = null,


    val commentedClassifications: kotlin.collections.List<CommentedClassificationDto>? = null

)

