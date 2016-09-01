package utils

import java.util.UUID

import slick.lifted.Rep
import slick.backend.DatabaseConfig
import slick.driver.JdbcProfile
import slick.jdbc.JdbcBackend
import slick.driver.PostgresDriver.api._
import slick.lifted.{Rep, ExtensionMethods}

/**
  * Created by MAPAT on 1/30/2016.
  */
object SlickUtils {
  def fk(sourceField: Rep[Option[UUID]], targetField: Rep[UUID]) = {
    sourceField.map(_ === targetField)
    //map?
    //filter isDefined?
  }
}
