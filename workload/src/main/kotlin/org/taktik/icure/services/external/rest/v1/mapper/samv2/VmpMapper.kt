/*
 *  iCure Data Stack. Copyright (c) 2020 Taktik SA
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Affero General Public License as
 *     published by the Free Software Foundation, either version 3 of the
 *     License, or (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful, but
 *     WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *     Affero General Public License for more details.
 *
 *     You should have received a copy of the GNU Affero General Public
 *     License along with this program.  If not, see
 *     <https://www.gnu.org/licenses/>.
 */

package org.taktik.icure.services.external.rest.v1.mapper.samv2

import org.mapstruct.InjectionStrategy
import org.mapstruct.Mapper
import org.mapstruct.Mapping
import org.mapstruct.Mappings
import org.taktik.icure.entities.samv2.Vmp
import org.taktik.icure.services.external.rest.v1.dto.samv2.VmpDto
import org.taktik.icure.services.external.rest.v1.mapper.EntityReferenceMapper
import org.taktik.icure.services.external.rest.v1.mapper.samv2.embed.CommentedClassificationMapper
import org.taktik.icure.services.external.rest.v1.mapper.samv2.embed.SamTextMapper
import org.taktik.icure.services.external.rest.v1.mapper.samv2.embed.VmpComponentMapper
import org.taktik.icure.services.external.rest.v1.mapper.samv2.embed.VtmMapper
import org.taktik.icure.services.external.rest.v1.mapper.samv2.embed.WadaMapper

@Mapper(componentModel = "spring", uses = [VtmMapper::class, SamTextMapper::class, VmpGroupStubMapper::class, CommentedClassificationMapper::class, VmpComponentMapper::class, EntityReferenceMapper::class, WadaMapper::class], injectionStrategy = InjectionStrategy.CONSTRUCTOR)
interface VmpMapper {
    @Mappings(
            Mapping(target = "attachments", ignore = true),
            Mapping(target = "revHistory", ignore = true),
            Mapping(target = "conflicts", ignore = true),
            Mapping(target = "revisionsInfo", ignore = true)
            )
	fun map(vmpDto: VmpDto):Vmp
	fun map(vmp: Vmp):VmpDto
}
