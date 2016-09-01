package utils

import com.bfil.automapper.Mapping
import slick.driver.PostgresDriver
import slick.lifted._
import slick.profile.{RelationalTableComponent, RelationalProfile}

import scala.reflect.ClassTag
import slick.driver.PostgresDriver.api._

object SlickExtension {
  implicit class DbDtoAutoMapping[Row](table: AbstractTable[Row]) {
    def >>[T](implicit tagT: ClassTag[T], tagRow: ClassTag[Row], mappingRowT: Mapping[Row, T]) =
      table.shaped.<>((v: Row) => mappingRowT.map(v), (v: T) => throw new Exception("Not supported"))

    def <>[T](implicit tagT: ClassTag[T], tagRow: ClassTag[Row], mappingRowT: Mapping[Row, T], mappingTRow: Mapping[T, Row]) =
      table.shaped.<>((v: Row) => mappingRowT.map(v), (v: T) => Option(mappingTRow.map(v)))
  }

}