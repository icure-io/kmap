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
 * @param reports
 * @param tags
 * @param rev
 * @param deletionDate hard delete (unix epoch in ms) timestamp of the object. Filled automatically when deletePatient is called.
 * @param layout
 * @param templateLayout
 * @param name
 * @param guid
 * @param group
 * @param descr
 * @param disabled
 * @param specialty
 * @param author
 * @param formInstancePreferredLocation
 * @param keyboardShortcut
 * @param shortReport
 * @param mediumReport
 * @param longReport
 * @param layoutAttachmentId
 */

data class FormTemplateDto (


    val id: kotlin.String,


    val reports: kotlin.collections.List<kotlin.String> = emptyList(),


    val tags: kotlin.collections.List<CodeStubDto> = emptyList(),


    val rev: kotlin.String? = null,

    /* hard delete (unix epoch in ms) timestamp of the object. Filled automatically when deletePatient is called. */

    val deletionDate: kotlin.Long? = null,


    val layout: FormLayout? = null,


    val templateLayout: FormTemplateLayout? = null,


    val name: kotlin.String? = null,


    val guid: kotlin.String? = null,


    val group: DocumentGroupDto? = null,


    val descr: kotlin.String? = null,


    val disabled: kotlin.String? = null,


    val specialty: CodeStubDto? = null,


    val author: kotlin.String? = null,


    val formInstancePreferredLocation: kotlin.String? = null,


    val keyboardShortcut: kotlin.String? = null,


    val shortReport: kotlin.String? = null,


    val mediumReport: kotlin.String? = null,


    val longReport: kotlin.String? = null,


    val layoutAttachmentId: kotlin.String? = null

)

