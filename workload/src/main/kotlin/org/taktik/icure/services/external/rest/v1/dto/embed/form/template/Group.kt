package org.taktik.icure.services.external.rest.v1.dto.embed.form.template



data class Group(
    val group: String,
    val fields: List<StructureElement>? = null,
) : StructureElement
