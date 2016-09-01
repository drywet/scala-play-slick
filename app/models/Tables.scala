package



// AUTO-GENERATED Slick data model
/** Stand-alone Slick data model for immediate use */
object Tables extends {
  val profile = slick.driver.PostgresDriver
} with Tables

/** Slick data model trait for extension, choice of backend or usage in the cake pattern. (Make sure to initialize this late.) */
trait Tables {

  val profile: slick.driver.JdbcProfile
  import profile.api._
  import slick.model.ForeignKeyAction
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** DDL for all tables. Call .create to execute. */
  lazy val schema: profile.SchemaDescription = Aaa.schema ++ Bbb.schema
  @deprecated("Use .schema instead of .ddl", "3.0")
  def ddl = schema

  /** Entity class storing rows of table Aaa
   *  @param uuid Database column uuid SqlType(uuid), PrimaryKey
   *  @param value Database column value SqlType(int4) */
  case class AaaRow(uuid: java.util.UUID, value: Int)
  /** GetResult implicit for fetching AaaRow objects using plain SQL queries */
  implicit def GetResultAaaRow(implicit e0: GR[java.util.UUID], e1: GR[Int]): GR[AaaRow] = GR{
    prs => import prs._
    AaaRow.tupled((<<[java.util.UUID], <<[Int]))
  }
  /** Table description of table aaa. Objects of this class serve as prototypes for rows in queries. */
  type AaaT = Aaa
  class Aaa(_tableTag: Tag) extends Table[AaaRow](_tableTag, Some("test"), "aaa") {
    def * = (uuid, value) <> (AaaRow.tupled, AaaRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(uuid), Rep.Some(value)).shaped.<>({r=>import r._; _1.map(_=> AaaRow.tupled((_1.get, _2.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column uuid SqlType(uuid), PrimaryKey */
    val uuid: Rep[java.util.UUID] = column[java.util.UUID]("uuid", O.PrimaryKey)
    /** Database column value SqlType(int4) */
    val value: Rep[Int] = column[Int]("value")
  }
  /** Collection-like TableQuery object for table Aaa */
  lazy val Aaa = new TableQuery(tag => new Aaa(tag))

  /** Entity class storing rows of table Bbb
   *  @param uuid Database column uuid SqlType(uuid), PrimaryKey
   *  @param aaaId Database column aaa_id SqlType(uuid), Default(None) */
  case class BbbRow(uuid: java.util.UUID, aaaId: Option[java.util.UUID] = None)
  /** GetResult implicit for fetching BbbRow objects using plain SQL queries */
  implicit def GetResultBbbRow(implicit e0: GR[java.util.UUID], e1: GR[Option[java.util.UUID]]): GR[BbbRow] = GR{
    prs => import prs._
    BbbRow.tupled((<<[java.util.UUID], <<?[java.util.UUID]))
  }
  type BbbT = Bbb
  /** Table description of table bbb. Objects of this class serve as prototypes for rows in queries. */
  class Bbb(_tableTag: Tag) extends Table[BbbRow](_tableTag, Some("test"), "bbb") {
    def * = (uuid, aaaId) <> (BbbRow.tupled, BbbRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(uuid), aaaId).shaped.<>({r=>import r._; _1.map(_=> BbbRow.tupled((_1.get, _2)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column uuid SqlType(uuid), PrimaryKey */
    val uuid: Rep[java.util.UUID] = column[java.util.UUID]("uuid", O.PrimaryKey)
    /** Database column aaa_id SqlType(uuid), Default(None) */
    val aaaId: Rep[Option[java.util.UUID]] = column[Option[java.util.UUID]]("aaa_id", O.Default(None))

    /** Foreign key referencing Aaa (database name bbb_aaa_id_fkey) */
    lazy val aaaFk = foreignKey("bbb_aaa_id_fkey", aaaId, Aaa)(r => Rep.Some(r.uuid), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Bbb */
  lazy val Bbb = new TableQuery(tag => new Bbb(tag))
}
