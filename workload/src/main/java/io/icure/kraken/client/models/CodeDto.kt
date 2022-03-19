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
 * @param regions
 * @param periodicity
 * @param links
 * @param qualifiedLinks
 * @param flags
 * @param searchTerms
 * @param appendices
 * @param disabled
 * @param rev
 * @param deletionDate hard delete (unix epoch in ms) timestamp of the object. Filled automatically when deletePatient is called.
 * @param context
 * @param type
 * @param code
 * @param version
 * @param label
 * @param author
 * @param level
 * @param `data`
 */

data class CodeDto (


    val id: kotlin.String,


    val regions: kotlin.collections.List<kotlin.String> = emptyList(),


    val periodicity: kotlin.collections.List<PeriodicityDto> = emptyList(),


    val links: kotlin.collections.List<kotlin.String> = emptyList(),


    val qualifiedLinks: kotlin.collections.Map<kotlin.String, kotlin.collections.List<kotlin.String>> = emptyMap(),


    val flags: kotlin.collections.List<CodeDto.Flags> = emptyList(),


    val searchTerms: kotlin.collections.Map<kotlin.String, kotlin.collections.Set<kotlin.String>> = emptyMap(),


    val appendices: kotlin.collections.Map<kotlin.String, kotlin.String> = emptyMap(),


    val disabled: kotlin.Boolean = false,


    val rev: kotlin.String? = null,

    /* hard delete (unix epoch in ms) timestamp of the object. Filled automatically when deletePatient is called. */

    val deletionDate: kotlin.Long? = null,


    val context: kotlin.String? = null,


    val type: kotlin.String? = null,


    val code: kotlin.String? = null,


    val version: kotlin.String? = null,


    val label: kotlin.collections.Map<kotlin.String, kotlin.String>? = null,


    val author: kotlin.String? = null,


    val level: kotlin.Int? = null,


    val `data`: kotlin.String? = null

) {

    /**
     *
     *
     * Values: maleOnly,femaleOnly,deptkinesitherapy,deptnursing,deptgeneralpractice,deptsocialworker,deptpsychology,deptadministrative,deptdietetics,deptspeechtherapy,deptdentistry,deptoccupationaltherapy,depthealthcare,deptgynecology,deptpediatry,deptalgology,deptanatomopathology,deptanesthesiology,deptbacteriology,deptcardiacsurgery,deptcardiology,deptchildandadolescentpsychiatry,deptdermatology,deptdiabetology,deptemergency,deptendocrinology,deptgastroenterology,deptgenetics,deptgeriatry,depthandsurgery,depthematology,deptinfectiousdisease,deptintensivecare,deptlaboratory,deptmajorburns,deptmaxillofacialsurgery,deptmedicine,deptmolecularbiology,deptneonatalogy,deptnephrology,deptneurology,deptneurosurgery,deptnte,deptnuclear,deptnutritiondietetics,deptobstetrics,deptoncology,deptophtalmology,deptorthopedy,deptpalliativecare,deptpediatricintensivecare,deptpediatricsurgery,deptpharmacy,deptphysicalmedecine,deptphysiotherapy,deptplasticandreparatorysurgery,deptpneumology,deptpodiatry,deptpsychiatry,deptradiology,deptradiotherapy,deptrevalidation,deptrheumatology,deptrhumatology,deptsenology,deptsocialservice,deptsportsmedecine,deptstomatology,deptsurgery,deptthoracicsurgery,depttoxicology,depttropicalmedecine,depturology,deptvascularsurgery,deptvisceraldigestiveabdominalsurgery,depttransplantsurgery,deptpercutaneous,deptchildbirth
     */
    enum class Flags(val value: kotlin.String) {
        maleOnly("male_only"),
        femaleOnly("female_only"),
        deptkinesitherapy("deptkinesitherapy"),
        deptnursing("deptnursing"),
        deptgeneralpractice("deptgeneralpractice"),
        deptsocialworker("deptsocialworker"),
        deptpsychology("deptpsychology"),
        deptadministrative("deptadministrative"),
        deptdietetics("deptdietetics"),
        deptspeechtherapy("deptspeechtherapy"),
        deptdentistry("deptdentistry"),
        deptoccupationaltherapy("deptoccupationaltherapy"),
        depthealthcare("depthealthcare"),
        deptgynecology("deptgynecology"),
        deptpediatry("deptpediatry"),
        deptalgology("deptalgology"),
        deptanatomopathology("deptanatomopathology"),
        deptanesthesiology("deptanesthesiology"),
        deptbacteriology("deptbacteriology"),
        deptcardiacsurgery("deptcardiacsurgery"),
        deptcardiology("deptcardiology"),
        deptchildandadolescentpsychiatry("deptchildandadolescentpsychiatry"),
        deptdermatology("deptdermatology"),
        deptdiabetology("deptdiabetology"),
        deptemergency("deptemergency"),
        deptendocrinology("deptendocrinology"),
        deptgastroenterology("deptgastroenterology"),
        deptgenetics("deptgenetics"),
        deptgeriatry("deptgeriatry"),
        depthandsurgery("depthandsurgery"),
        depthematology("depthematology"),
        deptinfectiousdisease("deptinfectiousdisease"),
        deptintensivecare("deptintensivecare"),
        deptlaboratory("deptlaboratory"),
        deptmajorburns("deptmajorburns"),
        deptmaxillofacialsurgery("deptmaxillofacialsurgery"),
        deptmedicine("deptmedicine"),
        deptmolecularbiology("deptmolecularbiology"),
        deptneonatalogy("deptneonatalogy"),
        deptnephrology("deptnephrology"),
        deptneurology("deptneurology"),
        deptneurosurgery("deptneurosurgery"),
        deptnte("deptnte"),
        deptnuclear("deptnuclear"),
        deptnutritiondietetics("deptnutritiondietetics"),
        deptobstetrics("deptobstetrics"),
        deptoncology("deptoncology"),
        deptophtalmology("deptophtalmology"),
        deptorthopedy("deptorthopedy"),
        deptpalliativecare("deptpalliativecare"),
        deptpediatricintensivecare("deptpediatricintensivecare"),
        deptpediatricsurgery("deptpediatricsurgery"),
        deptpharmacy("deptpharmacy"),
        deptphysicalmedecine("deptphysicalmedecine"),
        deptphysiotherapy("deptphysiotherapy"),
        deptplasticandreparatorysurgery("deptplasticandreparatorysurgery"),
        deptpneumology("deptpneumology"),
        deptpodiatry("deptpodiatry"),
        deptpsychiatry("deptpsychiatry"),
        deptradiology("deptradiology"),
        deptradiotherapy("deptradiotherapy"),
        deptrevalidation("deptrevalidation"),
        deptrheumatology("deptrheumatology"),
        deptrhumatology("deptrhumatology"),
        deptsenology("deptsenology"),
        deptsocialservice("deptsocialservice"),
        deptsportsmedecine("deptsportsmedecine"),
        deptstomatology("deptstomatology"),
        deptsurgery("deptsurgery"),
        deptthoracicsurgery("deptthoracicsurgery"),
        depttoxicology("depttoxicology"),
        depttropicalmedecine("depttropicalmedecine"),
        depturology("depturology"),
        deptvascularsurgery("deptvascularsurgery"),
        deptvisceraldigestiveabdominalsurgery("deptvisceraldigestiveabdominalsurgery"),
        depttransplantsurgery("depttransplantsurgery"),
        deptpercutaneous("deptpercutaneous"),
        deptchildbirth("deptchildbirth");
    }
}

