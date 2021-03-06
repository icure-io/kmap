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
 * @param contentType
 * @param contentMultiplier
 * @param packSpecification
 * @param deviceType
 * @param packagingType
 */

data class AmppComponentDto (


    val from: kotlin.Long? = null,


    val to: kotlin.Long? = null,


    val contentType: AmppComponentDto.ContentType? = null,


    val contentMultiplier: kotlin.Int? = null,


    val packSpecification: kotlin.String? = null,


    val deviceType: DeviceTypeDto? = null,


    val packagingType: PackagingTypeDto? = null

) {

    /**
     *
     *
     * Values: aCTIVECOMPONENT,sOLVENT,dEVICE,eXCIPIENT
     */
    enum class ContentType(val value: kotlin.String) {
        aCTIVECOMPONENT("ACTIVE_COMPONENT"),
        sOLVENT("SOLVENT"),
        dEVICE("DEVICE"),
        eXCIPIENT("EXCIPIENT");
    }
}

