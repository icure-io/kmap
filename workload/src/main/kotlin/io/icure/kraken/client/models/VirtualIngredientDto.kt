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
 * @param from
 * @param to
 * @param rank
 * @param type
 * @param strengthRange
 * @param substance
 */

data class VirtualIngredientDto (


    val from: kotlin.Long? = null,


    val to: kotlin.Long? = null,


    val rank: kotlin.Int? = null,


    val type: VirtualIngredientDto.Type? = null,


    val strengthRange: StrengthRangeDto? = null,


    val substance: SubstanceStubDto? = null

) {

    /**
     *
     *
     * Values: aCTIVESUBSTANCE,eXCIPIENT
     */
    enum class Type(val value: kotlin.String) {
        aCTIVESUBSTANCE("ACTIVE_SUBSTANCE"),
        eXCIPIENT("EXCIPIENT");
    }
}

