/*
import slick.lifted.Tag

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
  import slick.collection.heterogeneous._
  import slick.collection.heterogeneous.syntax._
  // NOTE: GetResult mappers for plain SQL are only generated for tables where Slick knows how to map the types of all columns.
  import slick.jdbc.{GetResult => GR}

  /** DDL for all tables. Call .create to execute. */
  lazy val schema: profile.SchemaDescription = Array(Configurations.schema, DataFormats.schema, DataRecordTypes.schema, Files.schema, Frames.schema, FtpCredentials.schema, FtpLogs.schema, Gateways.schema, GprsCalendarItems.schema, Locations.schema, Manufacturers.schema, MeasurementUnits.schema, MeasurementUnitsVife1.schema, MeasurementUnitsVife2.schema, MeasurementUnitsVifeOrtho.schema, Meters.schema, MeterTypes.schema, PlayEvolutions.schema, Templates.schema, WakeUpCalendarItems.schema).reduceLeft(_ ++ _)
  @deprecated("Use .schema instead of .ddl", "3.0")
  def ddl = schema

  /** Row type of table Configurations */
  type ConfigurationsRow = HCons[java.util.UUID,HCons[Option[java.sql.Timestamp],HCons[Option[java.sql.Timestamp],HCons[String,HCons[Option[Int],HCons[Int,HCons[Boolean,HCons[Option[Int],HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Option[String],HCons[Option[String],HCons[Boolean,HCons[Boolean,HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Int,HCons[Option[java.sql.Timestamp],HCons[java.util.UUID,HCons[Option[Long],HCons[Option[Long],HCons[String,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[String,HCons[Int,HCons[Int,HCons[Int,HCons[String,HCons[String,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[String,HCons[String,HCons[Int,HCons[Int,HNil]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
  /** Constructor for ConfigurationsRow providing default values if available in the database schema. */
  def ConfigurationsRow(uuid: java.util.UUID, createDate: Option[java.sql.Timestamp] = None, updateDate: Option[java.sql.Timestamp] = None, name: String, gprsConnectionTime: Option[Int] = None, gprsRunningMode: Int = 2, gprsSecureMode: Boolean = true, gprsWakeUpPeriod: Option[Int] = None, listeningDuration: Int = 4, maxSizeSave: Int = 200000, wmBusModeType: Int = 7, wmBusFrameLength: Int = 100, numberOfMeters: Int = 500, serialNumberFiltering: Option[String] = None, manufacturerIdFiltering: Option[String] = None, rejectMeterAlreadyMemorised: Boolean = true, meterFiltering: Boolean = false, programmableModeHour: Option[Int] = None, programmableModeNumberWakeUp: Option[Int] = None, defaultModeHour: Option[Int] = None, status: Int = 0, updateByGatewayTs: Option[java.sql.Timestamp] = None, gatewayId: java.util.UUID, successfullyAcceptedVersion: Option[Long] = Some(1L), tryPublicationVersion: Option[Long] = Some(1L), quadBand: String = "yes", gprsTimeoutInSec: Int = 180, gsmTimeoutInSec: Int = 180, keepAlive: Int = 8, maxFtpFileTransferInSec: Int = 180, ntpAddress: String = "fr.pool.ntp.org", retryTimeoutInSec: Int = 4, state: Int = 2, uartPort: Int = 1, autoConnection: String = "no", enableSerialize: String = "yes", flowMode: Int = 2, fragment: Int = 4000, ftpFlag: Int = 1, ftpMode: Int = 1, gatewayAddress: String = "193.28.233.151", gatewayAddressBackUp: String = "193.28.233.239", gatewayPort: Int = 22020, gatewayPortBackUp: Int = 22020): ConfigurationsRow = {
    uuid :: createDate :: updateDate :: name :: gprsConnectionTime :: gprsRunningMode :: gprsSecureMode :: gprsWakeUpPeriod :: listeningDuration :: maxSizeSave :: wmBusModeType :: wmBusFrameLength :: numberOfMeters :: serialNumberFiltering :: manufacturerIdFiltering :: rejectMeterAlreadyMemorised :: meterFiltering :: programmableModeHour :: programmableModeNumberWakeUp :: defaultModeHour :: status :: updateByGatewayTs :: gatewayId :: successfullyAcceptedVersion :: tryPublicationVersion :: quadBand :: gprsTimeoutInSec :: gsmTimeoutInSec :: keepAlive :: maxFtpFileTransferInSec :: ntpAddress :: retryTimeoutInSec :: state :: uartPort :: autoConnection :: enableSerialize :: flowMode :: fragment :: ftpFlag :: ftpMode :: gatewayAddress :: gatewayAddressBackUp :: gatewayPort :: gatewayPortBackUp :: HNil
  }
  /** GetResult implicit for fetching ConfigurationsRow objects using plain SQL queries */
  implicit def GetResultConfigurationsRow(implicit e0: GR[java.util.UUID], e1: GR[Option[java.sql.Timestamp]], e2: GR[String], e3: GR[Option[Int]], e4: GR[Int], e5: GR[Boolean], e6: GR[Option[String]], e7: GR[Option[Long]]): GR[ConfigurationsRow] = GR{
    prs => import prs._
    <<[java.util.UUID] :: <<?[java.sql.Timestamp] :: <<?[java.sql.Timestamp] :: <<[String] :: <<?[Int] :: <<[Int] :: <<[Boolean] :: <<?[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<?[String] :: <<?[String] :: <<[Boolean] :: <<[Boolean] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<[Int] :: <<?[java.sql.Timestamp] :: <<[java.util.UUID] :: <<?[Long] :: <<?[Long] :: <<[String] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[String] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[String] :: <<[String] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[Int] :: <<[String] :: <<[String] :: <<[Int] :: <<[Int] :: HNil
  }
  /** Table description of table configurations. Objects of this class serve as prototypes for rows in queries. */
  class Configurations(_tableTag: Tag) extends Table[ConfigurationsRow](_tableTag, Some("elive-devices"), "configurations") {
    def * = uuid :: createDate :: updateDate :: name :: gprsConnectionTime :: gprsRunningMode :: gprsSecureMode :: gprsWakeUpPeriod :: listeningDuration :: maxSizeSave :: wmBusModeType :: wmBusFrameLength :: numberOfMeters :: serialNumberFiltering :: manufacturerIdFiltering :: rejectMeterAlreadyMemorised :: meterFiltering :: programmableModeHour :: programmableModeNumberWakeUp :: defaultModeHour :: status :: updateByGatewayTs :: gatewayId :: successfullyAcceptedVersion :: tryPublicationVersion :: quadBand :: gprsTimeoutInSec :: gsmTimeoutInSec :: keepAlive :: maxFtpFileTransferInSec :: ntpAddress :: retryTimeoutInSec :: state :: uartPort :: autoConnection :: enableSerialize :: flowMode :: fragment :: ftpFlag :: ftpMode :: gatewayAddress :: gatewayAddressBackUp :: gatewayPort :: gatewayPortBackUp :: HNil

    /** Database column uuid SqlType(uuid), PrimaryKey */
    val uuid: Rep[java.util.UUID] = column[java.util.UUID]("uuid", O.PrimaryKey)
    /** Database column create_date SqlType(timestamp), Default(None) */
    val createDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("create_date", O.Default(None))
    /** Database column update_date SqlType(timestamp), Default(None) */
    val updateDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("update_date", O.Default(None))
    /** Database column name SqlType(varchar), Length(25,true) */
    val name: Rep[String] = column[String]("name", O.Length(25,varying=true))
    /** Database column gprs_connection_time SqlType(int4), Default(None) */
    val gprsConnectionTime: Rep[Option[Int]] = column[Option[Int]]("gprs_connection_time", O.Default(None))
    /** Database column gprs_running_mode SqlType(int4), Default(2) */
    val gprsRunningMode: Rep[Int] = column[Int]("gprs_running_mode", O.Default(2))
    /** Database column gprs_secure_mode SqlType(bool), Default(true) */
    val gprsSecureMode: Rep[Boolean] = column[Boolean]("gprs_secure_mode", O.Default(true))
    /** Database column gprs_wake_up_period SqlType(int4), Default(None) */
    val gprsWakeUpPeriod: Rep[Option[Int]] = column[Option[Int]]("gprs_wake_up_period", O.Default(None))
    /** Database column listening_duration SqlType(int4), Default(4) */
    val listeningDuration: Rep[Int] = column[Int]("listening_duration", O.Default(4))
    /** Database column max_size_save SqlType(int4), Default(200000) */
    val maxSizeSave: Rep[Int] = column[Int]("max_size_save", O.Default(200000))
    /** Database column wm_bus_mode_type SqlType(int4), Default(7) */
    val wmBusModeType: Rep[Int] = column[Int]("wm_bus_mode_type", O.Default(7))
    /** Database column wm_bus_frame_length SqlType(int4), Default(100) */
    val wmBusFrameLength: Rep[Int] = column[Int]("wm_bus_frame_length", O.Default(100))
    /** Database column number_of_meters SqlType(int4), Default(500) */
    val numberOfMeters: Rep[Int] = column[Int]("number_of_meters", O.Default(500))
    /** Database column serial_number_filtering SqlType(varchar), Length(2048,true), Default(None) */
    val serialNumberFiltering: Rep[Option[String]] = column[Option[String]]("serial_number_filtering", O.Length(2048,varying=true), O.Default(None))
    /** Database column manufacturer_id_filtering SqlType(varchar), Length(255,true), Default(None) */
    val manufacturerIdFiltering: Rep[Option[String]] = column[Option[String]]("manufacturer_id_filtering", O.Length(255,varying=true), O.Default(None))
    /** Database column reject_meter_already_memorised SqlType(bool), Default(true) */
    val rejectMeterAlreadyMemorised: Rep[Boolean] = column[Boolean]("reject_meter_already_memorised", O.Default(true))
    /** Database column meter_filtering SqlType(bool), Default(false) */
    val meterFiltering: Rep[Boolean] = column[Boolean]("meter_filtering", O.Default(false))
    /** Database column programmable_mode_hour SqlType(int4), Default(None) */
    val programmableModeHour: Rep[Option[Int]] = column[Option[Int]]("programmable_mode_hour", O.Default(None))
    /** Database column programmable_mode_number_wake_up SqlType(int4), Default(None) */
    val programmableModeNumberWakeUp: Rep[Option[Int]] = column[Option[Int]]("programmable_mode_number_wake_up", O.Default(None))
    /** Database column default_mode_hour SqlType(int4), Default(None) */
    val defaultModeHour: Rep[Option[Int]] = column[Option[Int]]("default_mode_hour", O.Default(None))
    /** Database column status SqlType(int4), Default(0) */
    val status: Rep[Int] = column[Int]("status", O.Default(0))
    /** Database column update_by_gateway_ts SqlType(timestamp), Default(None) */
    val updateByGatewayTs: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("update_by_gateway_ts", O.Default(None))
    /** Database column gateway_id SqlType(uuid) */
    val gatewayId: Rep[java.util.UUID] = column[java.util.UUID]("gateway_id")
    /** Database column successfully_accepted_version SqlType(int8), Default(Some(1)) */
    val successfullyAcceptedVersion: Rep[Option[Long]] = column[Option[Long]]("successfully_accepted_version", O.Default(Some(1L)))
    /** Database column try_publication_version SqlType(int8), Default(Some(1)) */
    val tryPublicationVersion: Rep[Option[Long]] = column[Option[Long]]("try_publication_version", O.Default(Some(1L)))
    /** Database column quad_band SqlType(varchar), Length(255,true), Default(yes) */
    val quadBand: Rep[String] = column[String]("quad_band", O.Length(255,varying=true), O.Default("yes"))
    /** Database column gprs_timeout_in_sec SqlType(int4), Default(180) */
    val gprsTimeoutInSec: Rep[Int] = column[Int]("gprs_timeout_in_sec", O.Default(180))
    /** Database column gsm_timeout_in_sec SqlType(int4), Default(180) */
    val gsmTimeoutInSec: Rep[Int] = column[Int]("gsm_timeout_in_sec", O.Default(180))
    /** Database column keep_alive SqlType(int4), Default(8) */
    val keepAlive: Rep[Int] = column[Int]("keep_alive", O.Default(8))
    /** Database column max_ftp_file_transfer_in_sec SqlType(int4), Default(180) */
    val maxFtpFileTransferInSec: Rep[Int] = column[Int]("max_ftp_file_transfer_in_sec", O.Default(180))
    /** Database column ntp_address SqlType(varchar), Length(255,true), Default(fr.pool.ntp.org) */
    val ntpAddress: Rep[String] = column[String]("ntp_address", O.Length(255,varying=true), O.Default("fr.pool.ntp.org"))
    /** Database column retry_timeout_in_sec SqlType(int4), Default(4) */
    val retryTimeoutInSec: Rep[Int] = column[Int]("retry_timeout_in_sec", O.Default(4))
    /** Database column state SqlType(int4), Default(2) */
    val state: Rep[Int] = column[Int]("state", O.Default(2))
    /** Database column uart_port SqlType(int4), Default(1) */
    val uartPort: Rep[Int] = column[Int]("uart_port", O.Default(1))
    /** Database column auto_connection SqlType(varchar), Length(255,true), Default(no) */
    val autoConnection: Rep[String] = column[String]("auto_connection", O.Length(255,varying=true), O.Default("no"))
    /** Database column enable_serialize SqlType(varchar), Length(255,true), Default(yes) */
    val enableSerialize: Rep[String] = column[String]("enable_serialize", O.Length(255,varying=true), O.Default("yes"))
    /** Database column flow_mode SqlType(int4), Default(2) */
    val flowMode: Rep[Int] = column[Int]("flow_mode", O.Default(2))
    /** Database column fragment SqlType(int4), Default(4000) */
    val fragment: Rep[Int] = column[Int]("fragment", O.Default(4000))
    /** Database column ftp_flag SqlType(int4), Default(1) */
    val ftpFlag: Rep[Int] = column[Int]("ftp_flag", O.Default(1))
    /** Database column ftp_mode SqlType(int4), Default(1) */
    val ftpMode: Rep[Int] = column[Int]("ftp_mode", O.Default(1))
    /** Database column gateway_address SqlType(varchar), Length(255,true), Default(193.28.233.151) */
    val gatewayAddress: Rep[String] = column[String]("gateway_address", O.Length(255,varying=true), O.Default("193.28.233.151"))
    /** Database column gateway_address_back_up SqlType(varchar), Length(255,true), Default(193.28.233.239) */
    val gatewayAddressBackUp: Rep[String] = column[String]("gateway_address_back_up", O.Length(255,varying=true), O.Default("193.28.233.239"))
    /** Database column gateway_port SqlType(int4), Default(22020) */
    val gatewayPort: Rep[Int] = column[Int]("gateway_port", O.Default(22020))
    /** Database column gateway_port_back_up SqlType(int4), Default(22020) */
    val gatewayPortBackUp: Rep[Int] = column[Int]("gateway_port_back_up", O.Default(22020))

    /** Foreign key referencing Gateways (database name configurations_gateway_id_fkey) */
    lazy val gatewaysFk = foreignKey("configurations_gateway_id_fkey", gatewayId :: HNil, Gateways)(r => r.uuid :: HNil, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Configurations */
  lazy val Configurations = new TableQuery(tag => new Configurations(tag))

  /** Entity class storing rows of table DataFormats
   *  @param uuid Database column uuid SqlType(uuid), PrimaryKey
   *  @param createDate Database column create_date SqlType(timestamp), Default(None)
   *  @param updateDate Database column update_date SqlType(timestamp), Default(None)
   *  @param aesKey Database column aes_key SqlType(varchar), Length(255,true)
   *  @param compressed Database column compressed SqlType(bool)
   *  @param encrypted Database column encrypted SqlType(bool)
   *  @param fileType Database column file_type SqlType(int4) */
  case class DataFormatsRow(uuid: java.util.UUID, createDate: Option[java.sql.Timestamp] = None, updateDate: Option[java.sql.Timestamp] = None, aesKey: String, compressed: Boolean, encrypted: Boolean, fileType: Int)
  /** GetResult implicit for fetching DataFormatsRow objects using plain SQL queries */
  implicit def GetResultDataFormatsRow(implicit e0: GR[java.util.UUID], e1: GR[Option[java.sql.Timestamp]], e2: GR[String], e3: GR[Boolean], e4: GR[Int]): GR[DataFormatsRow] = GR{
    prs => import prs._
    DataFormatsRow.tupled((<<[java.util.UUID], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<[String], <<[Boolean], <<[Boolean], <<[Int]))
  }
  /** Table description of table data_formats. Objects of this class serve as prototypes for rows in queries. */
  class DataFormats(_tableTag: Tag) extends Table[DataFormatsRow](_tableTag, Some("elive-devices"), "data_formats") {
    def * = (uuid, createDate, updateDate, aesKey, compressed, encrypted, fileType) <> (DataFormatsRow.tupled, DataFormatsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(uuid), createDate, updateDate, Rep.Some(aesKey), Rep.Some(compressed), Rep.Some(encrypted), Rep.Some(fileType)).shaped.<>({r=>import r._; _1.map(_=> DataFormatsRow.tupled((_1.get, _2, _3, _4.get, _5.get, _6.get, _7.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column uuid SqlType(uuid), PrimaryKey */
    val uuid: Rep[java.util.UUID] = column[java.util.UUID]("uuid", O.PrimaryKey)
    /** Database column create_date SqlType(timestamp), Default(None) */
    val createDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("create_date", O.Default(None))
    /** Database column update_date SqlType(timestamp), Default(None) */
    val updateDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("update_date", O.Default(None))
    /** Database column aes_key SqlType(varchar), Length(255,true) */
    val aesKey: Rep[String] = column[String]("aes_key", O.Length(255,varying=true))
    /** Database column compressed SqlType(bool) */
    val compressed: Rep[Boolean] = column[Boolean]("compressed")
    /** Database column encrypted SqlType(bool) */
    val encrypted: Rep[Boolean] = column[Boolean]("encrypted")
    /** Database column file_type SqlType(int4) */
    val fileType: Rep[Int] = column[Int]("file_type")
  }
  /** Collection-like TableQuery object for table DataFormats */
  lazy val DataFormats = new TableQuery(tag => new DataFormats(tag))

  /** Entity class storing rows of table DataRecordTypes
   *  @param uuid Database column uuid SqlType(uuid), PrimaryKey
   *  @param createDate Database column create_date SqlType(timestamp), Default(None)
   *  @param updateDate Database column update_date SqlType(timestamp), Default(None)
   *  @param name Database column name SqlType(varchar), Length(100,true)
   *  @param color Database column color SqlType(varchar), Length(10,true), Default(None)
   *  @param measurementUnitId Database column measurement_unit_id SqlType(uuid), Default(None)
   *  @param subtype Database column subtype SqlType(varchar), Length(100,true), Default(None)
   *  @param multiplier Database column multiplier SqlType(float8), Default(None) */
  case class DataRecordTypesRow(uuid: java.util.UUID, createDate: Option[java.sql.Timestamp] = None, updateDate: Option[java.sql.Timestamp] = None, name: String, color: Option[String] = None, measurementUnitId: Option[java.util.UUID] = None, subtype: Option[String] = None, multiplier: Option[Double] = None)
  /** GetResult implicit for fetching DataRecordTypesRow objects using plain SQL queries */
  implicit def GetResultDataRecordTypesRow(implicit e0: GR[java.util.UUID], e1: GR[Option[java.sql.Timestamp]], e2: GR[String], e3: GR[Option[String]], e4: GR[Option[java.util.UUID]], e5: GR[Option[Double]]): GR[DataRecordTypesRow] = GR{
    prs => import prs._
    DataRecordTypesRow.tupled((<<[java.util.UUID], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<[String], <<?[String], <<?[java.util.UUID], <<?[String], <<?[Double]))
  }
  /** Table description of table data_record_types. Objects of this class serve as prototypes for rows in queries. */
  class DataRecordTypes(_tableTag: Tag) extends Table[DataRecordTypesRow](_tableTag, Some("elive-devices"), "data_record_types") {
    def * = (uuid, createDate, updateDate, name, color, measurementUnitId, subtype, multiplier) <> (DataRecordTypesRow.tupled, DataRecordTypesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(uuid), createDate, updateDate, Rep.Some(name), color, measurementUnitId, subtype, multiplier).shaped.<>({r=>import r._; _1.map(_=> DataRecordTypesRow.tupled((_1.get, _2, _3, _4.get, _5, _6, _7, _8)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column uuid SqlType(uuid), PrimaryKey */
    val uuid: Rep[java.util.UUID] = column[java.util.UUID]("uuid", O.PrimaryKey)
    /** Database column create_date SqlType(timestamp), Default(None) */
    val createDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("create_date", O.Default(None))
    /** Database column update_date SqlType(timestamp), Default(None) */
    val updateDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("update_date", O.Default(None))
    /** Database column name SqlType(varchar), Length(100,true) */
    val name: Rep[String] = column[String]("name", O.Length(100,varying=true))
    /** Database column color SqlType(varchar), Length(10,true), Default(None) */
    val color: Rep[Option[String]] = column[Option[String]]("color", O.Length(10,varying=true), O.Default(None))
    /** Database column measurement_unit_id SqlType(uuid), Default(None) */
    val measurementUnitId: Rep[Option[java.util.UUID]] = column[Option[java.util.UUID]]("measurement_unit_id", O.Default(None))
    /** Database column subtype SqlType(varchar), Length(100,true), Default(None) */
    val subtype: Rep[Option[String]] = column[Option[String]]("subtype", O.Length(100,varying=true), O.Default(None))
    /** Database column multiplier SqlType(float8), Default(None) */
    val multiplier: Rep[Option[Double]] = column[Option[Double]]("multiplier", O.Default(None))

    /** Foreign key referencing MeasurementUnits (database name fk_measurement_unit) */
    lazy val measurementUnitsFk = foreignKey("fk_measurement_unit", measurementUnitId, MeasurementUnits)(r => Rep.Some(r.uuid), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Uniqueness Index over (name) (database name data_record_types_name_unique) */
    val index1 = index("data_record_types_name_unique", name, unique=true)
  }
  /** Collection-like TableQuery object for table DataRecordTypes */
  lazy val DataRecordTypes = new TableQuery(tag => new DataRecordTypes(tag))

  /** Row type of table Files */
  type FilesRow = HCons[java.util.UUID,HCons[Array[Byte],HCons[java.util.UUID,HCons[java.sql.Timestamp,HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Option[Long],HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Option[Int],HCons[Option[Array[Byte]],HCons[String,HNil]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
  /** Constructor for FilesRow providing default values if available in the database schema. */
  def FilesRow(uuid: java.util.UUID, data: Array[Byte], gatewayId: java.util.UUID, createdDate: java.sql.Timestamp, meterType: Option[Int] = None, meterTypeLength: Option[Int] = None, wmBusMainType: Option[Int] = None, wmBusMainTypeLength: Option[Int] = None, accumulatedConsumed: Option[Long] = None, batteryInsertionTimestamp: Option[Int] = None, numberOfAwakeningInSecond: Option[Int] = None, cumulativeWorkingTimeInSecond: Option[Int] = None, mobileCountryCode: Option[Int] = None, mobileNetworkCode: Option[Int] = None, validFramesReceivedCount: Option[Int] = None, metersReportInDatabaseCount: Option[Int] = None, metersAttachedToGatewayCount: Option[Int] = None, metersDetectedCount: Option[Int] = None, framesReceivedCount: Option[Int] = None, gsmRssi: Option[Int] = None, internalBatteriesVoltage: Option[Int] = None, externalBatteriesVoltage: Option[Int] = None, majorVersion: Option[Int] = None, minorVersion: Option[Int] = None, subminorVersion: Option[Int] = None, gatewayInternalTemperature: Option[Int] = None, cidType: Option[Int] = None, cidLength: Option[Int] = None, simIccid: Option[Array[Byte]] = None, filename: String): FilesRow = {
    uuid :: data :: gatewayId :: createdDate :: meterType :: meterTypeLength :: wmBusMainType :: wmBusMainTypeLength :: accumulatedConsumed :: batteryInsertionTimestamp :: numberOfAwakeningInSecond :: cumulativeWorkingTimeInSecond :: mobileCountryCode :: mobileNetworkCode :: validFramesReceivedCount :: metersReportInDatabaseCount :: metersAttachedToGatewayCount :: metersDetectedCount :: framesReceivedCount :: gsmRssi :: internalBatteriesVoltage :: externalBatteriesVoltage :: majorVersion :: minorVersion :: subminorVersion :: gatewayInternalTemperature :: cidType :: cidLength :: simIccid :: filename :: HNil
  }
  /** GetResult implicit for fetching FilesRow objects using plain SQL queries */
  implicit def GetResultFilesRow(implicit e0: GR[java.util.UUID], e1: GR[Array[Byte]], e2: GR[java.sql.Timestamp], e3: GR[Option[Int]], e4: GR[Option[Long]], e5: GR[Option[Array[Byte]]], e6: GR[String]): GR[FilesRow] = GR{
    prs => import prs._
    <<[java.util.UUID] :: <<[Array[Byte]] :: <<[java.util.UUID] :: <<[java.sql.Timestamp] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<?[Long] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<?[Int] :: <<?[Array[Byte]] :: <<[String] :: HNil
  }
  /** Table description of table files. Objects of this class serve as prototypes for rows in queries. */
  class Files(_tableTag: Tag) extends Table[FilesRow](_tableTag, Some("elive-devices"), "files") {
    def * = uuid :: data :: gatewayId :: createdDate :: meterType :: meterTypeLength :: wmBusMainType :: wmBusMainTypeLength :: accumulatedConsumed :: batteryInsertionTimestamp :: numberOfAwakeningInSecond :: cumulativeWorkingTimeInSecond :: mobileCountryCode :: mobileNetworkCode :: validFramesReceivedCount :: metersReportInDatabaseCount :: metersAttachedToGatewayCount :: metersDetectedCount :: framesReceivedCount :: gsmRssi :: internalBatteriesVoltage :: externalBatteriesVoltage :: majorVersion :: minorVersion :: subminorVersion :: gatewayInternalTemperature :: cidType :: cidLength :: simIccid :: filename :: HNil

    /** Database column uuid SqlType(uuid), PrimaryKey */
    val uuid: Rep[java.util.UUID] = column[java.util.UUID]("uuid", O.PrimaryKey)
    /** Database column data SqlType(bytea) */
    val data: Rep[Array[Byte]] = column[Array[Byte]]("data")
    /** Database column gateway_id SqlType(uuid) */
    val gatewayId: Rep[java.util.UUID] = column[java.util.UUID]("gateway_id")
    /** Database column created_date SqlType(timestamp) */
    val createdDate: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_date")
    /** Database column meter_type SqlType(int4), Default(None) */
    val meterType: Rep[Option[Int]] = column[Option[Int]]("meter_type", O.Default(None))
    /** Database column meter_type_length SqlType(int4), Default(None) */
    val meterTypeLength: Rep[Option[Int]] = column[Option[Int]]("meter_type_length", O.Default(None))
    /** Database column wm_bus_main_type SqlType(int4), Default(None) */
    val wmBusMainType: Rep[Option[Int]] = column[Option[Int]]("wm_bus_main_type", O.Default(None))
    /** Database column wm_bus_main_type_length SqlType(int4), Default(None) */
    val wmBusMainTypeLength: Rep[Option[Int]] = column[Option[Int]]("wm_bus_main_type_length", O.Default(None))
    /** Database column accumulated_consumed SqlType(int8), Default(None) */
    val accumulatedConsumed: Rep[Option[Long]] = column[Option[Long]]("accumulated_consumed", O.Default(None))
    /** Database column battery_insertion_timestamp SqlType(int4), Default(None) */
    val batteryInsertionTimestamp: Rep[Option[Int]] = column[Option[Int]]("battery_insertion_timestamp", O.Default(None))
    /** Database column number_of_awakening_in_second SqlType(int4), Default(None) */
    val numberOfAwakeningInSecond: Rep[Option[Int]] = column[Option[Int]]("number_of_awakening_in_second", O.Default(None))
    /** Database column cumulative_working_time_in_second SqlType(int4), Default(None) */
    val cumulativeWorkingTimeInSecond: Rep[Option[Int]] = column[Option[Int]]("cumulative_working_time_in_second", O.Default(None))
    /** Database column mobile_country_code SqlType(int4), Default(None) */
    val mobileCountryCode: Rep[Option[Int]] = column[Option[Int]]("mobile_country_code", O.Default(None))
    /** Database column mobile_network_code SqlType(int4), Default(None) */
    val mobileNetworkCode: Rep[Option[Int]] = column[Option[Int]]("mobile_network_code", O.Default(None))
    /** Database column valid_frames_received_count SqlType(int4), Default(None) */
    val validFramesReceivedCount: Rep[Option[Int]] = column[Option[Int]]("valid_frames_received_count", O.Default(None))
    /** Database column meters_report_in_database_count SqlType(int4), Default(None) */
    val metersReportInDatabaseCount: Rep[Option[Int]] = column[Option[Int]]("meters_report_in_database_count", O.Default(None))
    /** Database column meters_attached_to_gateway_count SqlType(int4), Default(None) */
    val metersAttachedToGatewayCount: Rep[Option[Int]] = column[Option[Int]]("meters_attached_to_gateway_count", O.Default(None))
    /** Database column meters_detected_count SqlType(int4), Default(None) */
    val metersDetectedCount: Rep[Option[Int]] = column[Option[Int]]("meters_detected_count", O.Default(None))
    /** Database column frames_received_count SqlType(int4), Default(None) */
    val framesReceivedCount: Rep[Option[Int]] = column[Option[Int]]("frames_received_count", O.Default(None))
    /** Database column gsm_rssi SqlType(int4), Default(None) */
    val gsmRssi: Rep[Option[Int]] = column[Option[Int]]("gsm_rssi", O.Default(None))
    /** Database column internal_batteries_voltage SqlType(int4), Default(None) */
    val internalBatteriesVoltage: Rep[Option[Int]] = column[Option[Int]]("internal_batteries_voltage", O.Default(None))
    /** Database column external_batteries_voltage SqlType(int4), Default(None) */
    val externalBatteriesVoltage: Rep[Option[Int]] = column[Option[Int]]("external_batteries_voltage", O.Default(None))
    /** Database column major_version SqlType(int4), Default(None) */
    val majorVersion: Rep[Option[Int]] = column[Option[Int]]("major_version", O.Default(None))
    /** Database column minor_version SqlType(int4), Default(None) */
    val minorVersion: Rep[Option[Int]] = column[Option[Int]]("minor_version", O.Default(None))
    /** Database column subminor_version SqlType(int4), Default(None) */
    val subminorVersion: Rep[Option[Int]] = column[Option[Int]]("subminor_version", O.Default(None))
    /** Database column gateway_internal_temperature SqlType(int4), Default(None) */
    val gatewayInternalTemperature: Rep[Option[Int]] = column[Option[Int]]("gateway_internal_temperature", O.Default(None))
    /** Database column cid_type SqlType(int4), Default(None) */
    val cidType: Rep[Option[Int]] = column[Option[Int]]("cid_type", O.Default(None))
    /** Database column cid_length SqlType(int4), Default(None) */
    val cidLength: Rep[Option[Int]] = column[Option[Int]]("cid_length", O.Default(None))
    /** Database column sim_iccid SqlType(bytea), Default(None) */
    val simIccid: Rep[Option[Array[Byte]]] = column[Option[Array[Byte]]]("sim_iccid", O.Default(None))
    /** Database column filename SqlType(varchar), Length(255,true) */
    val filename: Rep[String] = column[String]("filename", O.Length(255,varying=true))

    /** Foreign key referencing Gateways (database name files_gateway_id_fkey) */
    lazy val gatewaysFk = foreignKey("files_gateway_id_fkey", gatewayId :: HNil, Gateways)(r => r.uuid :: HNil, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Files */
  lazy val Files = new TableQuery(tag => new Files(tag))

  /** Entity class storing rows of table Frames
   *  @param uuid Database column uuid SqlType(uuid), PrimaryKey
   *  @param data Database column data SqlType(bytea)
   *  @param createdDate Database column created_date SqlType(timestamp)
   *  @param meterSerial Database column meter_serial SqlType(int4)
   *  @param fileId Database column file_id SqlType(uuid)
   *  @param rssi Database column rssi SqlType(int4), Default(None)
   *  @param manufactureId Database column manufacture_id SqlType(int4)
   *  @param version Database column version SqlType(int4)
   *  @param deviceType Database column device_type SqlType(int4) */
  case class FramesRow(uuid: java.util.UUID, data: Array[Byte], createdDate: java.sql.Timestamp, meterSerial: Int, fileId: java.util.UUID, rssi: Option[Int] = None, manufactureId: Int, version: Int, deviceType: Int)
  /** GetResult implicit for fetching FramesRow objects using plain SQL queries */
  implicit def GetResultFramesRow(implicit e0: GR[java.util.UUID], e1: GR[Array[Byte]], e2: GR[java.sql.Timestamp], e3: GR[Int], e4: GR[Option[Int]]): GR[FramesRow] = GR{
    prs => import prs._
    FramesRow.tupled((<<[java.util.UUID], <<[Array[Byte]], <<[java.sql.Timestamp], <<[Int], <<[java.util.UUID], <<?[Int], <<[Int], <<[Int], <<[Int]))
  }
  /** Table description of table frames. Objects of this class serve as prototypes for rows in queries. */
  class Frames(_tableTag: Tag) extends Table[FramesRow](_tableTag, Some("elive-devices"), "frames") {
    def * = (uuid, data, createdDate, meterSerial, fileId, rssi, manufactureId, version, deviceType) <> (FramesRow.tupled, FramesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(uuid), Rep.Some(data), Rep.Some(createdDate), Rep.Some(meterSerial), Rep.Some(fileId), rssi, Rep.Some(manufactureId), Rep.Some(version), Rep.Some(deviceType)).shaped.<>({r=>import r._; _1.map(_=> FramesRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get, _6, _7.get, _8.get, _9.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column uuid SqlType(uuid), PrimaryKey */
    val uuid: Rep[java.util.UUID] = column[java.util.UUID]("uuid", O.PrimaryKey)
    /** Database column data SqlType(bytea) */
    val data: Rep[Array[Byte]] = column[Array[Byte]]("data")
    /** Database column created_date SqlType(timestamp) */
    val createdDate: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("created_date")
    /** Database column meter_serial SqlType(int4) */
    val meterSerial: Rep[Int] = column[Int]("meter_serial")
    /** Database column file_id SqlType(uuid) */
    val fileId: Rep[java.util.UUID] = column[java.util.UUID]("file_id")
    /** Database column rssi SqlType(int4), Default(None) */
    val rssi: Rep[Option[Int]] = column[Option[Int]]("rssi", O.Default(None))
    /** Database column manufacture_id SqlType(int4) */
    val manufactureId: Rep[Int] = column[Int]("manufacture_id")
    /** Database column version SqlType(int4) */
    val version: Rep[Int] = column[Int]("version")
    /** Database column device_type SqlType(int4) */
    val deviceType: Rep[Int] = column[Int]("device_type")

    /** Foreign key referencing Files (database name frames_file_id_fkey) */
    lazy val filesFk = foreignKey("frames_file_id_fkey", fileId, Files)(r => r.uuid, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table Frames */
  lazy val Frames = new TableQuery(tag => new Frames(tag))

  /** Entity class storing rows of table FtpCredentials
   *  @param uuid Database column uuid SqlType(uuid), PrimaryKey
   *  @param createDate Database column create_date SqlType(timestamp), Default(None)
   *  @param updateDate Database column update_date SqlType(timestamp), Default(None)
   *  @param ftpAddress Database column ftp_address SqlType(varchar), Length(255,true)
   *  @param ftpLogin Database column ftp_login SqlType(varchar), Length(255,true), Default(None)
   *  @param ftpPassword Database column ftp_password SqlType(varchar), Length(255,true), Default(None)
   *  @param ftpPortNumber Database column ftp_port_number SqlType(int4)
   *  @param online Database column online SqlType(bool)
   *  @param name Database column name SqlType(varchar), Length(255,true) */
  case class FtpCredentialsRow(uuid: java.util.UUID, createDate: Option[java.sql.Timestamp] = None, updateDate: Option[java.sql.Timestamp] = None, ftpAddress: String, ftpLogin: Option[String] = None, ftpPassword: Option[String] = None, ftpPortNumber: Int, online: Boolean, name: String)
  /** GetResult implicit for fetching FtpCredentialsRow objects using plain SQL queries */
  implicit def GetResultFtpCredentialsRow(implicit e0: GR[java.util.UUID], e1: GR[Option[java.sql.Timestamp]], e2: GR[String], e3: GR[Option[String]], e4: GR[Int], e5: GR[Boolean]): GR[FtpCredentialsRow] = GR{
    prs => import prs._
    FtpCredentialsRow.tupled((<<[java.util.UUID], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<[String], <<?[String], <<?[String], <<[Int], <<[Boolean], <<[String]))
  }
  /** Table description of table ftp_credentials. Objects of this class serve as prototypes for rows in queries. */
  class FtpCredentials(_tableTag: Tag) extends Table[FtpCredentialsRow](_tableTag, Some("elive-devices"), "ftp_credentials") {
    def * = (uuid, createDate, updateDate, ftpAddress, ftpLogin, ftpPassword, ftpPortNumber, online, name) <> (FtpCredentialsRow.tupled, FtpCredentialsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(uuid), createDate, updateDate, Rep.Some(ftpAddress), ftpLogin, ftpPassword, Rep.Some(ftpPortNumber), Rep.Some(online), Rep.Some(name)).shaped.<>({r=>import r._; _1.map(_=> FtpCredentialsRow.tupled((_1.get, _2, _3, _4.get, _5, _6, _7.get, _8.get, _9.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column uuid SqlType(uuid), PrimaryKey */
    val uuid: Rep[java.util.UUID] = column[java.util.UUID]("uuid", O.PrimaryKey)
    /** Database column create_date SqlType(timestamp), Default(None) */
    val createDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("create_date", O.Default(None))
    /** Database column update_date SqlType(timestamp), Default(None) */
    val updateDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("update_date", O.Default(None))
    /** Database column ftp_address SqlType(varchar), Length(255,true) */
    val ftpAddress: Rep[String] = column[String]("ftp_address", O.Length(255,varying=true))
    /** Database column ftp_login SqlType(varchar), Length(255,true), Default(None) */
    val ftpLogin: Rep[Option[String]] = column[Option[String]]("ftp_login", O.Length(255,varying=true), O.Default(None))
    /** Database column ftp_password SqlType(varchar), Length(255,true), Default(None) */
    val ftpPassword: Rep[Option[String]] = column[Option[String]]("ftp_password", O.Length(255,varying=true), O.Default(None))
    /** Database column ftp_port_number SqlType(int4) */
    val ftpPortNumber: Rep[Int] = column[Int]("ftp_port_number")
    /** Database column online SqlType(bool) */
    val online: Rep[Boolean] = column[Boolean]("online")
    /** Database column name SqlType(varchar), Length(255,true) */
    val name: Rep[String] = column[String]("name", O.Length(255,varying=true))

    /** Uniqueness Index over (ftpAddress,ftpPortNumber,ftpLogin) (database name ftp_credentials_pkey_composed) */
    val index1 = index("ftp_credentials_pkey_composed", (ftpAddress, ftpPortNumber, ftpLogin), unique=true)
  }
  /** Collection-like TableQuery object for table FtpCredentials */
  lazy val FtpCredentials = new TableQuery(tag => new FtpCredentials(tag))

  /** Entity class storing rows of table FtpLogs
   *  @param uuid Database column uuid SqlType(uuid), PrimaryKey
   *  @param gatewaySerial Database column gateway_serial SqlType(varchar), Length(7,true)
   *  @param ftpAddress Database column ftp_address SqlType(varchar), Length(255,true)
   *  @param ftpStatusCode Database column ftp_status_code SqlType(int4)
   *  @param message Database column message SqlType(varchar), Length(255,true) */
  case class FtpLogsRow(uuid: java.util.UUID, gatewaySerial: String, ftpAddress: String, ftpStatusCode: Int, message: String)
  /** GetResult implicit for fetching FtpLogsRow objects using plain SQL queries */
  implicit def GetResultFtpLogsRow(implicit e0: GR[java.util.UUID], e1: GR[String], e2: GR[Int]): GR[FtpLogsRow] = GR{
    prs => import prs._
    FtpLogsRow.tupled((<<[java.util.UUID], <<[String], <<[String], <<[Int], <<[String]))
  }
  /** Table description of table ftp_logs. Objects of this class serve as prototypes for rows in queries. */
  class FtpLogs(_tableTag: Tag) extends Table[FtpLogsRow](_tableTag, Some("elive-devices"), "ftp_logs") {
    def * = (uuid, gatewaySerial, ftpAddress, ftpStatusCode, message) <> (FtpLogsRow.tupled, FtpLogsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(uuid), Rep.Some(gatewaySerial), Rep.Some(ftpAddress), Rep.Some(ftpStatusCode), Rep.Some(message)).shaped.<>({r=>import r._; _1.map(_=> FtpLogsRow.tupled((_1.get, _2.get, _3.get, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column uuid SqlType(uuid), PrimaryKey */
    val uuid: Rep[java.util.UUID] = column[java.util.UUID]("uuid", O.PrimaryKey)
    /** Database column gateway_serial SqlType(varchar), Length(7,true) */
    val gatewaySerial: Rep[String] = column[String]("gateway_serial", O.Length(7,varying=true))
    /** Database column ftp_address SqlType(varchar), Length(255,true) */
    val ftpAddress: Rep[String] = column[String]("ftp_address", O.Length(255,varying=true))
    /** Database column ftp_status_code SqlType(int4) */
    val ftpStatusCode: Rep[Int] = column[Int]("ftp_status_code")
    /** Database column message SqlType(varchar), Length(255,true) */
    val message: Rep[String] = column[String]("message", O.Length(255,varying=true))
  }
  /** Collection-like TableQuery object for table FtpLogs */
  lazy val FtpLogs = new TableQuery(tag => new FtpLogs(tag))

  /** Entity class storing rows of table Gateways
   *  @param uuid Database column uuid SqlType(uuid), PrimaryKey
   *  @param createDate Database column create_date SqlType(timestamp), Default(None)
   *  @param updateDate Database column update_date SqlType(timestamp), Default(None)
   *  @param name Database column name SqlType(varchar), Length(255,true)
   *  @param serialNumber Database column serial_number SqlType(varchar), Length(12,true)
   *  @param sellerId Database column seller_id SqlType(uuid)
   *  @param customerId Database column customer_id SqlType(uuid), Default(None)
   *  @param apn Database column apn SqlType(varchar), Length(255,true)
   *  @param apnBackup Database column apn_backup SqlType(varchar), Length(255,true), Default(None)
   *  @param login Database column login SqlType(varchar), Length(255,true), Default(None)
   *  @param password Database column password SqlType(varchar), Length(255,true), Default(None)
   *  @param pinCode Database column pin_code SqlType(varchar), Length(4,true), Default(None)
   *  @param recentActivityDate Database column recent_activity_date SqlType(timestamp), Default(None)
   *  @param locationId Database column location_id SqlType(uuid), Default(None)
   *  @param ftpCredentialsId Database column ftp_credentials_id SqlType(uuid)
   *  @param dataFormatId Database column data_format_id SqlType(uuid)
   *  @param status Database column status SqlType(int4), Default(None)
   *  @param manufacturerId Database column manufacturer_id SqlType(uuid)
   *  @param version Database column version SqlType(varchar), Length(255,true), Default(None)
   *  @param gatewayType Database column gateway_type SqlType(int4)
   *  @param telephoneNumber Database column telephone_number SqlType(varchar), Length(25,true), Default(None)
   *  @param readingFrequency Database column reading_frequency SqlType(int4), Default(None) */
  case class GatewaysRow(uuid: java.util.UUID, createDate: Option[java.sql.Timestamp] = None, updateDate: Option[java.sql.Timestamp] = None, name: String, serialNumber: String, sellerId: java.util.UUID, customerId: Option[java.util.UUID] = None, apn: String, apnBackup: Option[String] = None, login: Option[String] = None, password: Option[String] = None, pinCode: Option[String] = None, recentActivityDate: Option[java.sql.Timestamp] = None, locationId: Option[java.util.UUID] = None, ftpCredentialsId: java.util.UUID, dataFormatId: java.util.UUID, status: Option[Int] = None, manufacturerId: java.util.UUID, version: Option[String] = None, gatewayType: Int, telephoneNumber: Option[String] = None, readingFrequency: Option[Int] = None)
  /** GetResult implicit for fetching GatewaysRow objects using plain SQL queries */
  implicit def GetResultGatewaysRow(implicit e0: GR[java.util.UUID], e1: GR[Option[java.sql.Timestamp]], e2: GR[String], e3: GR[Option[java.util.UUID]], e4: GR[Option[String]], e5: GR[Option[Int]], e6: GR[Int]): GR[GatewaysRow] = GR{
    prs => import prs._
    GatewaysRow.tupled((<<[java.util.UUID], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<[String], <<[String], <<[java.util.UUID], <<?[java.util.UUID], <<[String], <<?[String], <<?[String], <<?[String], <<?[String], <<?[java.sql.Timestamp], <<?[java.util.UUID], <<[java.util.UUID], <<[java.util.UUID], <<?[Int], <<[java.util.UUID], <<?[String], <<[Int], <<?[String], <<?[Int]))
  }
  /** Table description of table gateways. Objects of this class serve as prototypes for rows in queries. */
  class Gateways(_tableTag: Tag) extends Table[GatewaysRow](_tableTag, Some("elive-devices"), "gateways") {
    def * = (uuid, createDate, updateDate, name, serialNumber, sellerId, customerId, apn, apnBackup, login, password, pinCode, recentActivityDate, locationId, ftpCredentialsId, dataFormatId, status, manufacturerId, version, gatewayType, telephoneNumber, readingFrequency) <> (GatewaysRow.tupled, GatewaysRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(uuid), createDate, updateDate, Rep.Some(name), Rep.Some(serialNumber), Rep.Some(sellerId), customerId, Rep.Some(apn), apnBackup, login, password, pinCode, recentActivityDate, locationId, Rep.Some(ftpCredentialsId), Rep.Some(dataFormatId), status, Rep.Some(manufacturerId), version, Rep.Some(gatewayType), telephoneNumber, readingFrequency).shaped.<>({r=>import r._; _1.map(_=> GatewaysRow.tupled((_1.get, _2, _3, _4.get, _5.get, _6.get, _7, _8.get, _9, _10, _11, _12, _13, _14, _15.get, _16.get, _17, _18.get, _19, _20.get, _21, _22)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column uuid SqlType(uuid), PrimaryKey */
    val uuid: Rep[java.util.UUID] = column[java.util.UUID]("uuid", O.PrimaryKey)
    /** Database column create_date SqlType(timestamp), Default(None) */
    val createDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("create_date", O.Default(None))
    /** Database column update_date SqlType(timestamp), Default(None) */
    val updateDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("update_date", O.Default(None))
    /** Database column name SqlType(varchar), Length(255,true) */
    val name: Rep[String] = column[String]("name", O.Length(255,varying=true))
    /** Database column serial_number SqlType(varchar), Length(12,true) */
    val serialNumber: Rep[String] = column[String]("serial_number", O.Length(12,varying=true))
    /** Database column seller_id SqlType(uuid) */
    val sellerId: Rep[java.util.UUID] = column[java.util.UUID]("seller_id")
    /** Database column customer_id SqlType(uuid), Default(None) */
    val customerId: Rep[Option[java.util.UUID]] = column[Option[java.util.UUID]]("customer_id", O.Default(None))
    /** Database column apn SqlType(varchar), Length(255,true) */
    val apn: Rep[String] = column[String]("apn", O.Length(255,varying=true))
    /** Database column apn_backup SqlType(varchar), Length(255,true), Default(None) */
    val apnBackup: Rep[Option[String]] = column[Option[String]]("apn_backup", O.Length(255,varying=true), O.Default(None))
    /** Database column login SqlType(varchar), Length(255,true), Default(None) */
    val login: Rep[Option[String]] = column[Option[String]]("login", O.Length(255,varying=true), O.Default(None))
    /** Database column password SqlType(varchar), Length(255,true), Default(None) */
    val password: Rep[Option[String]] = column[Option[String]]("password", O.Length(255,varying=true), O.Default(None))
    /** Database column pin_code SqlType(varchar), Length(4,true), Default(None) */
    val pinCode: Rep[Option[String]] = column[Option[String]]("pin_code", O.Length(4,varying=true), O.Default(None))
    /** Database column recent_activity_date SqlType(timestamp), Default(None) */
    val recentActivityDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("recent_activity_date", O.Default(None))
    /** Database column location_id SqlType(uuid), Default(None) */
    val locationId: Rep[Option[java.util.UUID]] = column[Option[java.util.UUID]]("location_id", O.Default(None))
    /** Database column ftp_credentials_id SqlType(uuid) */
    val ftpCredentialsId: Rep[java.util.UUID] = column[java.util.UUID]("ftp_credentials_id")
    /** Database column data_format_id SqlType(uuid) */
    val dataFormatId: Rep[java.util.UUID] = column[java.util.UUID]("data_format_id")
    /** Database column status SqlType(int4), Default(None) */
    val status: Rep[Option[Int]] = column[Option[Int]]("status", O.Default(None))
    /** Database column manufacturer_id SqlType(uuid) */
    val manufacturerId: Rep[java.util.UUID] = column[java.util.UUID]("manufacturer_id")
    /** Database column version SqlType(varchar), Length(255,true), Default(None) */
    val version: Rep[Option[String]] = column[Option[String]]("version", O.Length(255,varying=true), O.Default(None))
    /** Database column gateway_type SqlType(int4) */
    val gatewayType: Rep[Int] = column[Int]("gateway_type")
    /** Database column telephone_number SqlType(varchar), Length(25,true), Default(None) */
    val telephoneNumber: Rep[Option[String]] = column[Option[String]]("telephone_number", O.Length(25,varying=true), O.Default(None))
    /** Database column reading_frequency SqlType(int4), Default(None) */
    val readingFrequency: Rep[Option[Int]] = column[Option[Int]]("reading_frequency", O.Default(None))

    /** Foreign key referencing DataFormats (database name gateways_data_format_id_fkey) */
    lazy val dataFormatsFk = foreignKey("gateways_data_format_id_fkey", dataFormatId, DataFormats)(r => r.uuid, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing FtpCredentials (database name gateways_ftp_credentials_id_fkey) */
    lazy val ftpCredentialsFk = foreignKey("gateways_ftp_credentials_id_fkey", ftpCredentialsId, FtpCredentials)(r => r.uuid, onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Locations (database name gateways_location_id_fkey) */
    lazy val locationsFk = foreignKey("gateways_location_id_fkey", locationId, Locations)(r => Rep.Some(r.uuid), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Uniqueness Index over (serialNumber) (database name gateways_serial_number_key) */
    val index1 = index("gateways_serial_number_key", serialNumber, unique=true)
  }
  /** Collection-like TableQuery object for table Gateways */
  lazy val Gateways = new TableQuery(tag => new Gateways(tag))

  /** Entity class storing rows of table GprsCalendarItems
   *  @param uuid Database column uuid SqlType(uuid), PrimaryKey
   *  @param createDate Database column create_date SqlType(timestamp), Default(None)
   *  @param updateDate Database column update_date SqlType(timestamp), Default(None)
   *  @param days Database column days SqlType(int4)
   *  @param hour Database column hour SqlType(int4)
   *  @param isSending Database column is_sending SqlType(bool)
   *  @param configurationId Database column configuration_id SqlType(uuid), Default(None)
   *  @param templateId Database column template_id SqlType(uuid), Default(None) */
  case class GprsCalendarItemsRow(uuid: java.util.UUID, createDate: Option[java.sql.Timestamp] = None, updateDate: Option[java.sql.Timestamp] = None, days: Int, hour: Int, isSending: Boolean, configurationId: Option[java.util.UUID] = None, templateId: Option[java.util.UUID] = None)
  /** GetResult implicit for fetching GprsCalendarItemsRow objects using plain SQL queries */
  implicit def GetResultGprsCalendarItemsRow(implicit e0: GR[java.util.UUID], e1: GR[Option[java.sql.Timestamp]], e2: GR[Int], e3: GR[Boolean], e4: GR[Option[java.util.UUID]]): GR[GprsCalendarItemsRow] = GR{
    prs => import prs._
    GprsCalendarItemsRow.tupled((<<[java.util.UUID], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<[Int], <<[Int], <<[Boolean], <<?[java.util.UUID], <<?[java.util.UUID]))
  }
  /** Table description of table gprs_calendar_items. Objects of this class serve as prototypes for rows in queries. */
  class GprsCalendarItems(_tableTag: Tag) extends Table[GprsCalendarItemsRow](_tableTag, Some("elive-devices"), "gprs_calendar_items") {
    def * = (uuid, createDate, updateDate, days, hour, isSending, configurationId, templateId) <> (GprsCalendarItemsRow.tupled, GprsCalendarItemsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(uuid), createDate, updateDate, Rep.Some(days), Rep.Some(hour), Rep.Some(isSending), configurationId, templateId).shaped.<>({r=>import r._; _1.map(_=> GprsCalendarItemsRow.tupled((_1.get, _2, _3, _4.get, _5.get, _6.get, _7, _8)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column uuid SqlType(uuid), PrimaryKey */
    val uuid: Rep[java.util.UUID] = column[java.util.UUID]("uuid", O.PrimaryKey)
    /** Database column create_date SqlType(timestamp), Default(None) */
    val createDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("create_date", O.Default(None))
    /** Database column update_date SqlType(timestamp), Default(None) */
    val updateDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("update_date", O.Default(None))
    /** Database column days SqlType(int4) */
    val days: Rep[Int] = column[Int]("days")
    /** Database column hour SqlType(int4) */
    val hour: Rep[Int] = column[Int]("hour")
    /** Database column is_sending SqlType(bool) */
    val isSending: Rep[Boolean] = column[Boolean]("is_sending")
    /** Database column configuration_id SqlType(uuid), Default(None) */
    val configurationId: Rep[Option[java.util.UUID]] = column[Option[java.util.UUID]]("configuration_id", O.Default(None))
    /** Database column template_id SqlType(uuid), Default(None) */
    val templateId: Rep[Option[java.util.UUID]] = column[Option[java.util.UUID]]("template_id", O.Default(None))

    /** Foreign key referencing Configurations (database name gprs_calendar_items_configuration_id_fkey) */
    lazy val configurationsFk = foreignKey("gprs_calendar_items_configuration_id_fkey", configurationId, Configurations)(r => Rep.Some(r.uuid), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Templates (database name gprs_calendar_items_template_id_fkey) */
    lazy val templatesFk = foreignKey("gprs_calendar_items_template_id_fkey", templateId, Templates)(r => Rep.Some(r.uuid), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table GprsCalendarItems */
  lazy val GprsCalendarItems = new TableQuery(tag => new GprsCalendarItems(tag))

  /** Entity class storing rows of table Locations
   *  @param uuid Database column uuid SqlType(uuid), PrimaryKey
   *  @param createDate Database column create_date SqlType(timestamp), Default(None)
   *  @param updateDate Database column update_date SqlType(timestamp), Default(None)
   *  @param apartmentNumber Database column apartment_number SqlType(varchar), Length(255,true), Default(None)
   *  @param city Database column city SqlType(varchar), Length(255,true)
   *  @param country Database column country SqlType(varchar), Length(255,true)
   *  @param lat Database column lat SqlType(float4)
   *  @param lng Database column lng SqlType(float4)
   *  @param street Database column street SqlType(varchar), Length(255,true)
   *  @param streetNumber Database column street_number SqlType(varchar), Length(255,true)
   *  @param zipCode Database column zip_code SqlType(varchar), Length(25,true)
   *  @param floor Database column floor SqlType(varchar), Length(100,true), Default(None)
   *  @param departmentId Database column department_id SqlType(uuid) */
  case class LocationsRow(uuid: java.util.UUID, createDate: Option[java.sql.Timestamp] = None, updateDate: Option[java.sql.Timestamp] = None, apartmentNumber: Option[String] = None, city: String, country: String, lat: Float, lng: Float, street: String, streetNumber: String, zipCode: String, floor: Option[String] = None, departmentId: java.util.UUID)
  /** GetResult implicit for fetching LocationsRow objects using plain SQL queries */
  implicit def GetResultLocationsRow(implicit e0: GR[java.util.UUID], e1: GR[Option[java.sql.Timestamp]], e2: GR[Option[String]], e3: GR[String], e4: GR[Float]): GR[LocationsRow] = GR{
    prs => import prs._
    LocationsRow.tupled((<<[java.util.UUID], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<?[String], <<[String], <<[String], <<[Float], <<[Float], <<[String], <<[String], <<[String], <<?[String], <<[java.util.UUID]))
  }
  /** Table description of table locations. Objects of this class serve as prototypes for rows in queries. */
  class Locations(_tableTag: Tag) extends Table[LocationsRow](_tableTag, Some("elive-devices"), "locations") {
    def * = (uuid, createDate, updateDate, apartmentNumber, city, country, lat, lng, street, streetNumber, zipCode, floor, departmentId) <> (LocationsRow.tupled, LocationsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(uuid), createDate, updateDate, apartmentNumber, Rep.Some(city), Rep.Some(country), Rep.Some(lat), Rep.Some(lng), Rep.Some(street), Rep.Some(streetNumber), Rep.Some(zipCode), floor, Rep.Some(departmentId)).shaped.<>({r=>import r._; _1.map(_=> LocationsRow.tupled((_1.get, _2, _3, _4, _5.get, _6.get, _7.get, _8.get, _9.get, _10.get, _11.get, _12, _13.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column uuid SqlType(uuid), PrimaryKey */
    val uuid: Rep[java.util.UUID] = column[java.util.UUID]("uuid", O.PrimaryKey)
    /** Database column create_date SqlType(timestamp), Default(None) */
    val createDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("create_date", O.Default(None))
    /** Database column update_date SqlType(timestamp), Default(None) */
    val updateDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("update_date", O.Default(None))
    /** Database column apartment_number SqlType(varchar), Length(255,true), Default(None) */
    val apartmentNumber: Rep[Option[String]] = column[Option[String]]("apartment_number", O.Length(255,varying=true), O.Default(None))
    /** Database column city SqlType(varchar), Length(255,true) */
    val city: Rep[String] = column[String]("city", O.Length(255,varying=true))
    /** Database column country SqlType(varchar), Length(255,true) */
    val country: Rep[String] = column[String]("country", O.Length(255,varying=true))
    /** Database column lat SqlType(float4) */
    val lat: Rep[Float] = column[Float]("lat")
    /** Database column lng SqlType(float4) */
    val lng: Rep[Float] = column[Float]("lng")
    /** Database column street SqlType(varchar), Length(255,true) */
    val street: Rep[String] = column[String]("street", O.Length(255,varying=true))
    /** Database column street_number SqlType(varchar), Length(255,true) */
    val streetNumber: Rep[String] = column[String]("street_number", O.Length(255,varying=true))
    /** Database column zip_code SqlType(varchar), Length(25,true) */
    val zipCode: Rep[String] = column[String]("zip_code", O.Length(25,varying=true))
    /** Database column floor SqlType(varchar), Length(100,true), Default(None) */
    val floor: Rep[Option[String]] = column[Option[String]]("floor", O.Length(100,varying=true), O.Default(None))
    /** Database column department_id SqlType(uuid) */
    val departmentId: Rep[java.util.UUID] = column[java.util.UUID]("department_id")
  }
  /** Collection-like TableQuery object for table Locations */
  lazy val Locations = new TableQuery(tag => new Locations(tag))

  /** Entity class storing rows of table Manufacturers
   *  @param uuid Database column uuid SqlType(uuid), PrimaryKey
   *  @param createDate Database column create_date SqlType(timestamp), Default(None)
   *  @param updateDate Database column update_date SqlType(timestamp), Default(None)
   *  @param name Database column name SqlType(varchar), Length(255,true)
   *  @param code Database column code SqlType(varchar), Length(4,true)
   *  @param numberCode Database column number_code SqlType(int4)
   *  @param gatewaysManufacturer Database column gateways_manufacturer SqlType(bool), Default(false) */
  case class ManufacturersRow(uuid: java.util.UUID, createDate: Option[java.sql.Timestamp] = None, updateDate: Option[java.sql.Timestamp] = None, name: String, code: String, numberCode: Int, gatewaysManufacturer: Boolean = false)
  /** GetResult implicit for fetching ManufacturersRow objects using plain SQL queries */
  implicit def GetResultManufacturersRow(implicit e0: GR[java.util.UUID], e1: GR[Option[java.sql.Timestamp]], e2: GR[String], e3: GR[Int], e4: GR[Boolean]): GR[ManufacturersRow] = GR{
    prs => import prs._
    ManufacturersRow.tupled((<<[java.util.UUID], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<[String], <<[String], <<[Int], <<[Boolean]))
  }
  /** Table description of table manufacturers. Objects of this class serve as prototypes for rows in queries. */
  class Manufacturers(_tableTag: Tag) extends Table[ManufacturersRow](_tableTag, Some("elive-devices"), "manufacturers") {
    def * = (uuid, createDate, updateDate, name, code, numberCode, gatewaysManufacturer) <> (ManufacturersRow.tupled, ManufacturersRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(uuid), createDate, updateDate, Rep.Some(name), Rep.Some(code), Rep.Some(numberCode), Rep.Some(gatewaysManufacturer)).shaped.<>({r=>import r._; _1.map(_=> ManufacturersRow.tupled((_1.get, _2, _3, _4.get, _5.get, _6.get, _7.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column uuid SqlType(uuid), PrimaryKey */
    val uuid: Rep[java.util.UUID] = column[java.util.UUID]("uuid", O.PrimaryKey)
    /** Database column create_date SqlType(timestamp), Default(None) */
    val createDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("create_date", O.Default(None))
    /** Database column update_date SqlType(timestamp), Default(None) */
    val updateDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("update_date", O.Default(None))
    /** Database column name SqlType(varchar), Length(255,true) */
    val name: Rep[String] = column[String]("name", O.Length(255,varying=true))
    /** Database column code SqlType(varchar), Length(4,true) */
    val code: Rep[String] = column[String]("code", O.Length(4,varying=true))
    /** Database column number_code SqlType(int4) */
    val numberCode: Rep[Int] = column[Int]("number_code")
    /** Database column gateways_manufacturer SqlType(bool), Default(false) */
    val gatewaysManufacturer: Rep[Boolean] = column[Boolean]("gateways_manufacturer", O.Default(false))

    /** Uniqueness Index over (code) (database name manufacturers_code_key) */
    val index1 = index("manufacturers_code_key", code, unique=true)
  }
  /** Collection-like TableQuery object for table Manufacturers */
  lazy val Manufacturers = new TableQuery(tag => new Manufacturers(tag))

  /** Entity class storing rows of table MeasurementUnits
   *  @param uuid Database column uuid SqlType(uuid), PrimaryKey
   *  @param createDate Database column create_date SqlType(timestamp), Default(None)
   *  @param updateDate Database column update_date SqlType(timestamp), Default(None)
   *  @param name Database column name SqlType(varchar), Length(255,true)
   *  @param description Database column description SqlType(varchar), Length(255,true), Default(None)
   *  @param code Database column code SqlType(varchar), Length(7,true)
   *  @param multiplierOperation Database column multiplier_operation SqlType(char)
   *  @param multiplierValue Database column multiplier_value SqlType(int4) */
  case class MeasurementUnitsRow(uuid: java.util.UUID, createDate: Option[java.sql.Timestamp] = None, updateDate: Option[java.sql.Timestamp] = None, name: String, description: Option[String] = None, code: String, multiplierOperation: Char, multiplierValue: Int)
  /** GetResult implicit for fetching MeasurementUnitsRow objects using plain SQL queries */
  implicit def GetResultMeasurementUnitsRow(implicit e0: GR[java.util.UUID], e1: GR[Option[java.sql.Timestamp]], e2: GR[String], e3: GR[Option[String]], e4: GR[Char], e5: GR[Int]): GR[MeasurementUnitsRow] = GR{
    prs => import prs._
    MeasurementUnitsRow.tupled((<<[java.util.UUID], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<[String], <<?[String], <<[String], <<[Char], <<[Int]))
  }
  /** Table description of table measurement_units. Objects of this class serve as prototypes for rows in queries. */
  class MeasurementUnits(_tableTag: Tag) extends Table[MeasurementUnitsRow](_tableTag, Some("elive-devices"), "measurement_units") {
    def * = (uuid, createDate, updateDate, name, description, code, multiplierOperation, multiplierValue) <> (MeasurementUnitsRow.tupled, MeasurementUnitsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(uuid), createDate, updateDate, Rep.Some(name), description, Rep.Some(code), Rep.Some(multiplierOperation), Rep.Some(multiplierValue)).shaped.<>({r=>import r._; _1.map(_=> MeasurementUnitsRow.tupled((_1.get, _2, _3, _4.get, _5, _6.get, _7.get, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column uuid SqlType(uuid), PrimaryKey */
    val uuid: Rep[java.util.UUID] = column[java.util.UUID]("uuid", O.PrimaryKey)
    /** Database column create_date SqlType(timestamp), Default(None) */
    val createDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("create_date", O.Default(None))
    /** Database column update_date SqlType(timestamp), Default(None) */
    val updateDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("update_date", O.Default(None))
    /** Database column name SqlType(varchar), Length(255,true) */
    val name: Rep[String] = column[String]("name", O.Length(255,varying=true))
    /** Database column description SqlType(varchar), Length(255,true), Default(None) */
    val description: Rep[Option[String]] = column[Option[String]]("description", O.Length(255,varying=true), O.Default(None))
    /** Database column code SqlType(varchar), Length(7,true) */
    val code: Rep[String] = column[String]("code", O.Length(7,varying=true))
    /** Database column multiplier_operation SqlType(char) */
    val multiplierOperation: Rep[Char] = column[Char]("multiplier_operation")
    /** Database column multiplier_value SqlType(int4) */
    val multiplierValue: Rep[Int] = column[Int]("multiplier_value")

    /** Uniqueness Index over (code) (database name measurement_units_code_key) */
    val index1 = index("measurement_units_code_key", code, unique=true)
  }
  /** Collection-like TableQuery object for table MeasurementUnits */
  lazy val MeasurementUnits = new TableQuery(tag => new MeasurementUnits(tag))

  /** Entity class storing rows of table MeasurementUnitsVife1
   *  @param uuid Database column uuid SqlType(uuid), PrimaryKey
   *  @param createDate Database column create_date SqlType(timestamp), Default(None)
   *  @param updateDate Database column update_date SqlType(timestamp), Default(None)
   *  @param name Database column name SqlType(varchar), Length(255,true)
   *  @param description Database column description SqlType(varchar), Length(255,true), Default(None)
   *  @param code Database column code SqlType(varchar), Length(7,true)
   *  @param multiplierOperation Database column multiplier_operation SqlType(char)
   *  @param multiplierValue Database column multiplier_value SqlType(int4) */
  case class MeasurementUnitsVife1Row(uuid: java.util.UUID, createDate: Option[java.sql.Timestamp] = None, updateDate: Option[java.sql.Timestamp] = None, name: String, description: Option[String] = None, code: String, multiplierOperation: Char, multiplierValue: Int)
  /** GetResult implicit for fetching MeasurementUnitsVife1Row objects using plain SQL queries */
  implicit def GetResultMeasurementUnitsVife1Row(implicit e0: GR[java.util.UUID], e1: GR[Option[java.sql.Timestamp]], e2: GR[String], e3: GR[Option[String]], e4: GR[Char], e5: GR[Int]): GR[MeasurementUnitsVife1Row] = GR{
    prs => import prs._
    MeasurementUnitsVife1Row.tupled((<<[java.util.UUID], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<[String], <<?[String], <<[String], <<[Char], <<[Int]))
  }
  /** Table description of table measurement_units_vife1. Objects of this class serve as prototypes for rows in queries. */
  class MeasurementUnitsVife1(_tableTag: Tag) extends Table[MeasurementUnitsVife1Row](_tableTag, Some("elive-devices"), "measurement_units_vife1") {
    def * = (uuid, createDate, updateDate, name, description, code, multiplierOperation, multiplierValue) <> (MeasurementUnitsVife1Row.tupled, MeasurementUnitsVife1Row.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(uuid), createDate, updateDate, Rep.Some(name), description, Rep.Some(code), Rep.Some(multiplierOperation), Rep.Some(multiplierValue)).shaped.<>({r=>import r._; _1.map(_=> MeasurementUnitsVife1Row.tupled((_1.get, _2, _3, _4.get, _5, _6.get, _7.get, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column uuid SqlType(uuid), PrimaryKey */
    val uuid: Rep[java.util.UUID] = column[java.util.UUID]("uuid", O.PrimaryKey)
    /** Database column create_date SqlType(timestamp), Default(None) */
    val createDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("create_date", O.Default(None))
    /** Database column update_date SqlType(timestamp), Default(None) */
    val updateDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("update_date", O.Default(None))
    /** Database column name SqlType(varchar), Length(255,true) */
    val name: Rep[String] = column[String]("name", O.Length(255,varying=true))
    /** Database column description SqlType(varchar), Length(255,true), Default(None) */
    val description: Rep[Option[String]] = column[Option[String]]("description", O.Length(255,varying=true), O.Default(None))
    /** Database column code SqlType(varchar), Length(7,true) */
    val code: Rep[String] = column[String]("code", O.Length(7,varying=true))
    /** Database column multiplier_operation SqlType(char) */
    val multiplierOperation: Rep[Char] = column[Char]("multiplier_operation")
    /** Database column multiplier_value SqlType(int4) */
    val multiplierValue: Rep[Int] = column[Int]("multiplier_value")

    /** Uniqueness Index over (code) (database name measurement_units_vife1_code_key) */
    val index1 = index("measurement_units_vife1_code_key", code, unique=true)
  }
  /** Collection-like TableQuery object for table MeasurementUnitsVife1 */
  lazy val MeasurementUnitsVife1 = new TableQuery(tag => new MeasurementUnitsVife1(tag))

  /** Entity class storing rows of table MeasurementUnitsVife2
   *  @param uuid Database column uuid SqlType(uuid), PrimaryKey
   *  @param createDate Database column create_date SqlType(timestamp), Default(None)
   *  @param updateDate Database column update_date SqlType(timestamp), Default(None)
   *  @param name Database column name SqlType(varchar), Length(255,true)
   *  @param description Database column description SqlType(varchar), Length(255,true), Default(None)
   *  @param code Database column code SqlType(varchar), Length(7,true)
   *  @param multiplierOperation Database column multiplier_operation SqlType(char)
   *  @param multiplierValue Database column multiplier_value SqlType(int4) */
  case class MeasurementUnitsVife2Row(uuid: java.util.UUID, createDate: Option[java.sql.Timestamp] = None, updateDate: Option[java.sql.Timestamp] = None, name: String, description: Option[String] = None, code: String, multiplierOperation: Char, multiplierValue: Int)
  /** GetResult implicit for fetching MeasurementUnitsVife2Row objects using plain SQL queries */
  implicit def GetResultMeasurementUnitsVife2Row(implicit e0: GR[java.util.UUID], e1: GR[Option[java.sql.Timestamp]], e2: GR[String], e3: GR[Option[String]], e4: GR[Char], e5: GR[Int]): GR[MeasurementUnitsVife2Row] = GR{
    prs => import prs._
    MeasurementUnitsVife2Row.tupled((<<[java.util.UUID], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<[String], <<?[String], <<[String], <<[Char], <<[Int]))
  }
  /** Table description of table measurement_units_vife2. Objects of this class serve as prototypes for rows in queries. */
  class MeasurementUnitsVife2(_tableTag: Tag) extends Table[MeasurementUnitsVife2Row](_tableTag, Some("elive-devices"), "measurement_units_vife2") {
    def * = (uuid, createDate, updateDate, name, description, code, multiplierOperation, multiplierValue) <> (MeasurementUnitsVife2Row.tupled, MeasurementUnitsVife2Row.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(uuid), createDate, updateDate, Rep.Some(name), description, Rep.Some(code), Rep.Some(multiplierOperation), Rep.Some(multiplierValue)).shaped.<>({r=>import r._; _1.map(_=> MeasurementUnitsVife2Row.tupled((_1.get, _2, _3, _4.get, _5, _6.get, _7.get, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column uuid SqlType(uuid), PrimaryKey */
    val uuid: Rep[java.util.UUID] = column[java.util.UUID]("uuid", O.PrimaryKey)
    /** Database column create_date SqlType(timestamp), Default(None) */
    val createDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("create_date", O.Default(None))
    /** Database column update_date SqlType(timestamp), Default(None) */
    val updateDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("update_date", O.Default(None))
    /** Database column name SqlType(varchar), Length(255,true) */
    val name: Rep[String] = column[String]("name", O.Length(255,varying=true))
    /** Database column description SqlType(varchar), Length(255,true), Default(None) */
    val description: Rep[Option[String]] = column[Option[String]]("description", O.Length(255,varying=true), O.Default(None))
    /** Database column code SqlType(varchar), Length(7,true) */
    val code: Rep[String] = column[String]("code", O.Length(7,varying=true))
    /** Database column multiplier_operation SqlType(char) */
    val multiplierOperation: Rep[Char] = column[Char]("multiplier_operation")
    /** Database column multiplier_value SqlType(int4) */
    val multiplierValue: Rep[Int] = column[Int]("multiplier_value")

    /** Uniqueness Index over (code) (database name measurement_units_vife2_code_key) */
    val index1 = index("measurement_units_vife2_code_key", code, unique=true)
  }
  /** Collection-like TableQuery object for table MeasurementUnitsVife2 */
  lazy val MeasurementUnitsVife2 = new TableQuery(tag => new MeasurementUnitsVife2(tag))

  /** Entity class storing rows of table MeasurementUnitsVifeOrtho
   *  @param uuid Database column uuid SqlType(uuid), PrimaryKey
   *  @param createDate Database column create_date SqlType(timestamp), Default(None)
   *  @param updateDate Database column update_date SqlType(timestamp), Default(None)
   *  @param name Database column name SqlType(varchar), Length(255,true)
   *  @param description Database column description SqlType(varchar), Length(255,true), Default(None)
   *  @param code Database column code SqlType(varchar), Length(7,true)
   *  @param multiplierOperation Database column multiplier_operation SqlType(char)
   *  @param multiplierValue Database column multiplier_value SqlType(int4) */
  case class MeasurementUnitsVifeOrthoRow(uuid: java.util.UUID, createDate: Option[java.sql.Timestamp] = None, updateDate: Option[java.sql.Timestamp] = None, name: String, description: Option[String] = None, code: String, multiplierOperation: Char, multiplierValue: Int)
  /** GetResult implicit for fetching MeasurementUnitsVifeOrthoRow objects using plain SQL queries */
  implicit def GetResultMeasurementUnitsVifeOrthoRow(implicit e0: GR[java.util.UUID], e1: GR[Option[java.sql.Timestamp]], e2: GR[String], e3: GR[Option[String]], e4: GR[Char], e5: GR[Int]): GR[MeasurementUnitsVifeOrthoRow] = GR{
    prs => import prs._
    MeasurementUnitsVifeOrthoRow.tupled((<<[java.util.UUID], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<[String], <<?[String], <<[String], <<[Char], <<[Int]))
  }
  /** Table description of table measurement_units_vife_ortho. Objects of this class serve as prototypes for rows in queries. */
  class MeasurementUnitsVifeOrtho(_tableTag: Tag) extends Table[MeasurementUnitsVifeOrthoRow](_tableTag, Some("elive-devices"), "measurement_units_vife_ortho") {
    def * = (uuid, createDate, updateDate, name, description, code, multiplierOperation, multiplierValue) <> (MeasurementUnitsVifeOrthoRow.tupled, MeasurementUnitsVifeOrthoRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(uuid), createDate, updateDate, Rep.Some(name), description, Rep.Some(code), Rep.Some(multiplierOperation), Rep.Some(multiplierValue)).shaped.<>({r=>import r._; _1.map(_=> MeasurementUnitsVifeOrthoRow.tupled((_1.get, _2, _3, _4.get, _5, _6.get, _7.get, _8.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column uuid SqlType(uuid), PrimaryKey */
    val uuid: Rep[java.util.UUID] = column[java.util.UUID]("uuid", O.PrimaryKey)
    /** Database column create_date SqlType(timestamp), Default(None) */
    val createDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("create_date", O.Default(None))
    /** Database column update_date SqlType(timestamp), Default(None) */
    val updateDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("update_date", O.Default(None))
    /** Database column name SqlType(varchar), Length(255,true) */
    val name: Rep[String] = column[String]("name", O.Length(255,varying=true))
    /** Database column description SqlType(varchar), Length(255,true), Default(None) */
    val description: Rep[Option[String]] = column[Option[String]]("description", O.Length(255,varying=true), O.Default(None))
    /** Database column code SqlType(varchar), Length(7,true) */
    val code: Rep[String] = column[String]("code", O.Length(7,varying=true))
    /** Database column multiplier_operation SqlType(char) */
    val multiplierOperation: Rep[Char] = column[Char]("multiplier_operation")
    /** Database column multiplier_value SqlType(int4) */
    val multiplierValue: Rep[Int] = column[Int]("multiplier_value")

    /** Uniqueness Index over (code) (database name measurement_units_vife_ortho_code_key) */
    val index1 = index("measurement_units_vife_ortho_code_key", code, unique=true)
  }
  /** Collection-like TableQuery object for table MeasurementUnitsVifeOrtho */
  lazy val MeasurementUnitsVifeOrtho = new TableQuery(tag => new MeasurementUnitsVifeOrtho(tag))

  /** Entity class storing rows of table Meters
   *  @param uuid Database column uuid SqlType(uuid), PrimaryKey
   *  @param createDate Database column create_date SqlType(timestamp), Default(None)
   *  @param updateDate Database column update_date SqlType(timestamp), Default(None)
   *  @param name Database column name SqlType(varchar), Length(255,true)
   *  @param description Database column description SqlType(varchar), Length(255,true), Default(None)
   *  @param modelName Database column model_name SqlType(varchar), Length(128,true), Default(None)
   *  @param serialNumber Database column serial_number SqlType(int4)
   *  @param aesKey Database column aes_key SqlType(varchar), Length(255,true), Default(None)
   *  @param version Database column version SqlType(int2), Default(None)
   *  @param rssi Database column rssi SqlType(int4), Default(Some(-2147483648))
   *  @param customName Database column custom_name SqlType(varchar), Length(255,true), Default(None)
   *  @param connected Database column connected SqlType(bool)
   *  @param indoorsLocation Database column indoors_location SqlType(varchar), Length(255,true), Default(None)
   *  @param sellerId Database column seller_id SqlType(uuid)
   *  @param customerId Database column customer_id SqlType(uuid), Default(None)
   *  @param consumerId Database column consumer_id SqlType(uuid), Default(None)
   *  @param meterTemplateId Database column meter_template_id SqlType(uuid), Default(None)
   *  @param manufacturerId Database column manufacturer_id SqlType(uuid), Default(None)
   *  @param meterTypeId Database column meter_type_id SqlType(uuid), Default(None)
   *  @param locationId Database column location_id SqlType(uuid), Default(None)
   *  @param gatewayId Database column gateway_id SqlType(uuid), Default(None) */
  case class MetersRow(uuid: java.util.UUID, createDate: Option[java.sql.Timestamp] = None, updateDate: Option[java.sql.Timestamp] = None, name: String, description: Option[String] = None, modelName: Option[String] = None, serialNumber: Int, aesKey: Option[String] = None, version: Option[Short] = None, rssi: Option[Int] = Some(-2147483648), customName: Option[String] = None, connected: Boolean, indoorsLocation: Option[String] = None, sellerId: java.util.UUID, customerId: Option[java.util.UUID] = None, consumerId: Option[java.util.UUID] = None, meterTemplateId: Option[java.util.UUID] = None, manufacturerId: Option[java.util.UUID] = None, meterTypeId: Option[java.util.UUID] = None, locationId: Option[java.util.UUID] = None, gatewayId: Option[java.util.UUID] = None)
  /** GetResult implicit for fetching MetersRow objects using plain SQL queries */
  implicit def GetResultMetersRow(implicit e0: GR[java.util.UUID], e1: GR[Option[java.sql.Timestamp]], e2: GR[String], e3: GR[Option[String]], e4: GR[Int], e5: GR[Option[Short]], e6: GR[Option[Int]], e7: GR[Boolean], e8: GR[Option[java.util.UUID]]): GR[MetersRow] = GR{
    prs => import prs._
    MetersRow.tupled((<<[java.util.UUID], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<[String], <<?[String], <<?[String], <<[Int], <<?[String], <<?[Short], <<?[Int], <<?[String], <<[Boolean], <<?[String], <<[java.util.UUID], <<?[java.util.UUID], <<?[java.util.UUID], <<?[java.util.UUID], <<?[java.util.UUID], <<?[java.util.UUID], <<?[java.util.UUID], <<?[java.util.UUID]))
  }
  /** Table description of table meters. Objects of this class serve as prototypes for rows in queries. */
  class Meters(_tableTag: Tag) extends Table[MetersRow](_tableTag, Some("elive-devices"), "meters") {
    def * = (uuid, createDate, updateDate, name, description, modelName, serialNumber, aesKey, version, rssi, customName, connected, indoorsLocation, sellerId, customerId, consumerId, meterTemplateId, manufacturerId, meterTypeId, locationId, gatewayId) <> (MetersRow.tupled, MetersRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(uuid), createDate, updateDate, Rep.Some(name), description, modelName, Rep.Some(serialNumber), aesKey, version, rssi, customName, Rep.Some(connected), indoorsLocation, Rep.Some(sellerId), customerId, consumerId, meterTemplateId, manufacturerId, meterTypeId, locationId, gatewayId).shaped.<>({r=>import r._; _1.map(_=> MetersRow.tupled((_1.get, _2, _3, _4.get, _5, _6, _7.get, _8, _9, _10, _11, _12.get, _13, _14.get, _15, _16, _17, _18, _19, _20, _21)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column uuid SqlType(uuid), PrimaryKey */
    val uuid: Rep[java.util.UUID] = column[java.util.UUID]("uuid", O.PrimaryKey)
    /** Database column create_date SqlType(timestamp), Default(None) */
    val createDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("create_date", O.Default(None))
    /** Database column update_date SqlType(timestamp), Default(None) */
    val updateDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("update_date", O.Default(None))
    /** Database column name SqlType(varchar), Length(255,true) */
    val name: Rep[String] = column[String]("name", O.Length(255,varying=true))
    /** Database column description SqlType(varchar), Length(255,true), Default(None) */
    val description: Rep[Option[String]] = column[Option[String]]("description", O.Length(255,varying=true), O.Default(None))
    /** Database column model_name SqlType(varchar), Length(128,true), Default(None) */
    val modelName: Rep[Option[String]] = column[Option[String]]("model_name", O.Length(128,varying=true), O.Default(None))
    /** Database column serial_number SqlType(int4) */
    val serialNumber: Rep[Int] = column[Int]("serial_number")
    /** Database column aes_key SqlType(varchar), Length(255,true), Default(None) */
    val aesKey: Rep[Option[String]] = column[Option[String]]("aes_key", O.Length(255,varying=true), O.Default(None))
    /** Database column version SqlType(int2), Default(None) */
    val version: Rep[Option[Short]] = column[Option[Short]]("version", O.Default(None))
    /** Database column rssi SqlType(int4), Default(Some(-2147483648)) */
    val rssi: Rep[Option[Int]] = column[Option[Int]]("rssi", O.Default(Some(-2147483648)))
    /** Database column custom_name SqlType(varchar), Length(255,true), Default(None) */
    val customName: Rep[Option[String]] = column[Option[String]]("custom_name", O.Length(255,varying=true), O.Default(None))
    /** Database column connected SqlType(bool) */
    val connected: Rep[Boolean] = column[Boolean]("connected")
    /** Database column indoors_location SqlType(varchar), Length(255,true), Default(None) */
    val indoorsLocation: Rep[Option[String]] = column[Option[String]]("indoors_location", O.Length(255,varying=true), O.Default(None))
    /** Database column seller_id SqlType(uuid) */
    val sellerId: Rep[java.util.UUID] = column[java.util.UUID]("seller_id")
    /** Database column customer_id SqlType(uuid), Default(None) */
    val customerId: Rep[Option[java.util.UUID]] = column[Option[java.util.UUID]]("customer_id", O.Default(None))
    /** Database column consumer_id SqlType(uuid), Default(None) */
    val consumerId: Rep[Option[java.util.UUID]] = column[Option[java.util.UUID]]("consumer_id", O.Default(None))
    /** Database column meter_template_id SqlType(uuid), Default(None) */
    val meterTemplateId: Rep[Option[java.util.UUID]] = column[Option[java.util.UUID]]("meter_template_id", O.Default(None))
    /** Database column manufacturer_id SqlType(uuid), Default(None) */
    val manufacturerId: Rep[Option[java.util.UUID]] = column[Option[java.util.UUID]]("manufacturer_id", O.Default(None))
    /** Database column meter_type_id SqlType(uuid), Default(None) */
    val meterTypeId: Rep[Option[java.util.UUID]] = column[Option[java.util.UUID]]("meter_type_id", O.Default(None))
    /** Database column location_id SqlType(uuid), Default(None) */
    val locationId: Rep[Option[java.util.UUID]] = column[Option[java.util.UUID]]("location_id", O.Default(None))
    /** Database column gateway_id SqlType(uuid), Default(None) */
    val gatewayId: Rep[Option[java.util.UUID]] = column[Option[java.util.UUID]]("gateway_id", O.Default(None))

    /** Foreign key referencing Gateways (database name meters_gateway_id_fkey) */
    lazy val gatewaysFk = foreignKey("meters_gateway_id_fkey", gatewayId, Gateways)(r => Rep.Some(r.uuid), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Locations (database name meters_location_id_fkey) */
    lazy val locationsFk = foreignKey("meters_location_id_fkey", locationId, Locations)(r => Rep.Some(r.uuid), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Manufacturers (database name meters_manufacturer_id_fkey) */
    lazy val manufacturersFk = foreignKey("meters_manufacturer_id_fkey", manufacturerId, Manufacturers)(r => Rep.Some(r.uuid), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing MeterTypes (database name meters_meter_type_id_fkey) */
    lazy val meterTypesFk = foreignKey("meters_meter_type_id_fkey", meterTypeId, MeterTypes)(r => Rep.Some(r.uuid), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)

    /** Uniqueness Index over (serialNumber) (database name metres_serial_number_key) */
    val index1 = index("metres_serial_number_key", serialNumber, unique=true)
  }
  /** Collection-like TableQuery object for table Meters */
  lazy val Meters = new TableQuery(tag => new Meters(tag))

  /** Entity class storing rows of table MeterTypes
   *  @param uuid Database column uuid SqlType(uuid), PrimaryKey
   *  @param createDate Database column create_date SqlType(timestamp), Default(None)
   *  @param updateDate Database column update_date SqlType(timestamp), Default(None)
   *  @param name Database column name SqlType(varchar), Length(255,true)
   *  @param code Database column code SqlType(int4) */
  case class MeterTypesRow(uuid: java.util.UUID, createDate: Option[java.sql.Timestamp] = None, updateDate: Option[java.sql.Timestamp] = None, name: String, code: Int)
  /** GetResult implicit for fetching MeterTypesRow objects using plain SQL queries */
  implicit def GetResultMeterTypesRow(implicit e0: GR[java.util.UUID], e1: GR[Option[java.sql.Timestamp]], e2: GR[String], e3: GR[Int]): GR[MeterTypesRow] = GR{
    prs => import prs._
    MeterTypesRow.tupled((<<[java.util.UUID], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<[String], <<[Int]))
  }

  abstract class Table2[T](_tableTag: Tag, _schemaName: Option[String], _tableName: String) extends Table[T](_tableTag, _schemaName, _tableName) {
    val uuid: Rep[java.util.UUID]
  }

  /** Table description of table meter_types. Objects of this class serve as prototypes for rows in queries. */
  class MeterTypes(_tableTag: Tag) extends Table2[MeterTypesRow](_tableTag, Some("elive-devices"), "meter_types") {
    def * = (uuid, createDate, updateDate, name, code) <> (MeterTypesRow.tupled, MeterTypesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(uuid), createDate, updateDate, Rep.Some(name), Rep.Some(code)).shaped.<>({r=>import r._; _1.map(_=> MeterTypesRow.tupled((_1.get, _2, _3, _4.get, _5.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column uuid SqlType(uuid), PrimaryKey */
    val uuid: Rep[java.util.UUID] = column[java.util.UUID]("uuid", O.PrimaryKey)
    /** Database column create_date SqlType(timestamp), Default(None) */
    val createDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("create_date", O.Default(None))
    /** Database column update_date SqlType(timestamp), Default(None) */
    val updateDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("update_date", O.Default(None))
    /** Database column name SqlType(varchar), Length(255,true) */
    val name: Rep[String] = column[String]("name", O.Length(255,varying=true))
    /** Database column code SqlType(int4) */
    val code: Rep[Int] = column[Int]("code")

    /** Uniqueness Index over (code) (database name meter_types_code_key) */
    val index1 = index("meter_types_code_key", code, unique=true)
  }
  /** Collection-like TableQuery object for table MeterTypes */
  lazy val MeterTypes = new TableQuery(tag => new MeterTypes(tag))

  /** Entity class storing rows of table PlayEvolutions
   *  @param id Database column id SqlType(int4), PrimaryKey
   *  @param hash Database column hash SqlType(varchar), Length(255,true)
   *  @param appliedAt Database column applied_at SqlType(timestamp)
   *  @param applyScript Database column apply_script SqlType(text), Default(None)
   *  @param revertScript Database column revert_script SqlType(text), Default(None)
   *  @param state Database column state SqlType(varchar), Length(255,true), Default(None)
   *  @param lastProblem Database column last_problem SqlType(text), Default(None) */
  case class PlayEvolutionsRow(id: Int, hash: String, appliedAt: java.sql.Timestamp, applyScript: Option[String] = None, revertScript: Option[String] = None, state: Option[String] = None, lastProblem: Option[String] = None)
  /** GetResult implicit for fetching PlayEvolutionsRow objects using plain SQL queries */
  implicit def GetResultPlayEvolutionsRow(implicit e0: GR[Int], e1: GR[String], e2: GR[java.sql.Timestamp], e3: GR[Option[String]]): GR[PlayEvolutionsRow] = GR{
    prs => import prs._
    PlayEvolutionsRow.tupled((<<[Int], <<[String], <<[java.sql.Timestamp], <<?[String], <<?[String], <<?[String], <<?[String]))
  }
  /** Table description of table play_evolutions. Objects of this class serve as prototypes for rows in queries. */
  class PlayEvolutions(_tableTag: Tag) extends Table[PlayEvolutionsRow](_tableTag, Some("elive-devices"), "play_evolutions") {
    def * = (id, hash, appliedAt, applyScript, revertScript, state, lastProblem) <> (PlayEvolutionsRow.tupled, PlayEvolutionsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(id), Rep.Some(hash), Rep.Some(appliedAt), applyScript, revertScript, state, lastProblem).shaped.<>({r=>import r._; _1.map(_=> PlayEvolutionsRow.tupled((_1.get, _2.get, _3.get, _4, _5, _6, _7)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column id SqlType(int4), PrimaryKey */
    val id: Rep[Int] = column[Int]("id", O.PrimaryKey)
    /** Database column hash SqlType(varchar), Length(255,true) */
    val hash: Rep[String] = column[String]("hash", O.Length(255,varying=true))
    /** Database column applied_at SqlType(timestamp) */
    val appliedAt: Rep[java.sql.Timestamp] = column[java.sql.Timestamp]("applied_at")
    /** Database column apply_script SqlType(text), Default(None) */
    val applyScript: Rep[Option[String]] = column[Option[String]]("apply_script", O.Default(None))
    /** Database column revert_script SqlType(text), Default(None) */
    val revertScript: Rep[Option[String]] = column[Option[String]]("revert_script", O.Default(None))
    /** Database column state SqlType(varchar), Length(255,true), Default(None) */
    val state: Rep[Option[String]] = column[Option[String]]("state", O.Length(255,varying=true), O.Default(None))
    /** Database column last_problem SqlType(text), Default(None) */
    val lastProblem: Rep[Option[String]] = column[Option[String]]("last_problem", O.Default(None))
  }
  /** Collection-like TableQuery object for table PlayEvolutions */
  lazy val PlayEvolutions = new TableQuery(tag => new PlayEvolutions(tag))

  /** Entity class storing rows of table Templates
   *  @param uuid Database column uuid SqlType(uuid), PrimaryKey
   *  @param createDate Database column create_date SqlType(timestamp), Default(None)
   *  @param updateDate Database column update_date SqlType(timestamp), Default(None)
   *  @param name Database column name SqlType(varchar), Length(25,true)
   *  @param gprsConnectionTime Database column gprs_connection_time SqlType(int4), Default(None)
   *  @param gprsRunningMode Database column gprs_running_mode SqlType(int4), Default(None)
   *  @param gprsSecureMode Database column gprs_secure_mode SqlType(bool), Default(None)
   *  @param gprsWakeUpPeriod Database column gprs_wake_up_period SqlType(int4), Default(None)
   *  @param listeningDuration Database column listening_duration SqlType(int4), Default(None)
   *  @param wmBusModeType Database column wm_bus_mode_type SqlType(int4), Default(None)
   *  @param wmBusFrameLength Database column wm_bus_frame_length SqlType(int4), Default(None)
   *  @param numberOfMeters Database column number_of_meters SqlType(int4), Default(None)
   *  @param rejectMeterAlreadyMemorised Database column reject_meter_already_memorised SqlType(bool), Default(None)
   *  @param manufacturerIdFiltering Database column manufacturer_id_filtering SqlType(varchar), Length(255,true), Default(None)
   *  @param serialNumberFiltering Database column serial_number_filtering SqlType(varchar), Length(2048,true), Default(None)
   *  @param meterFiltering Database column meter_filtering SqlType(bool), Default(None)
   *  @param departmentId Database column department_id SqlType(uuid) */
  case class TemplatesRow(uuid: java.util.UUID, createDate: Option[java.sql.Timestamp] = None, updateDate: Option[java.sql.Timestamp] = None, name: String, gprsConnectionTime: Option[Int] = None, gprsRunningMode: Option[Int] = None, gprsSecureMode: Option[Boolean] = None, gprsWakeUpPeriod: Option[Int] = None, listeningDuration: Option[Int] = None, wmBusModeType: Option[Int] = None, wmBusFrameLength: Option[Int] = None, numberOfMeters: Option[Int] = None, rejectMeterAlreadyMemorised: Option[Boolean] = None, manufacturerIdFiltering: Option[String] = None, serialNumberFiltering: Option[String] = None, meterFiltering: Option[Boolean] = None, departmentId: java.util.UUID)
  /** GetResult implicit for fetching TemplatesRow objects using plain SQL queries */
  implicit def GetResultTemplatesRow(implicit e0: GR[java.util.UUID], e1: GR[Option[java.sql.Timestamp]], e2: GR[String], e3: GR[Option[Int]], e4: GR[Option[Boolean]], e5: GR[Option[String]]): GR[TemplatesRow] = GR{
    prs => import prs._
    TemplatesRow.tupled((<<[java.util.UUID], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<[String], <<?[Int], <<?[Int], <<?[Boolean], <<?[Int], <<?[Int], <<?[Int], <<?[Int], <<?[Int], <<?[Boolean], <<?[String], <<?[String], <<?[Boolean], <<[java.util.UUID]))
  }
  /** Table description of table templates. Objects of this class serve as prototypes for rows in queries. */
  class Templates(_tableTag: Tag) extends Table[TemplatesRow](_tableTag, Some("elive-devices"), "templates") {
    def * = (uuid, createDate, updateDate, name, gprsConnectionTime, gprsRunningMode, gprsSecureMode, gprsWakeUpPeriod, listeningDuration, wmBusModeType, wmBusFrameLength, numberOfMeters, rejectMeterAlreadyMemorised, manufacturerIdFiltering, serialNumberFiltering, meterFiltering, departmentId) <> (TemplatesRow.tupled, TemplatesRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(uuid), createDate, updateDate, Rep.Some(name), gprsConnectionTime, gprsRunningMode, gprsSecureMode, gprsWakeUpPeriod, listeningDuration, wmBusModeType, wmBusFrameLength, numberOfMeters, rejectMeterAlreadyMemorised, manufacturerIdFiltering, serialNumberFiltering, meterFiltering, Rep.Some(departmentId)).shaped.<>({r=>import r._; _1.map(_=> TemplatesRow.tupled((_1.get, _2, _3, _4.get, _5, _6, _7, _8, _9, _10, _11, _12, _13, _14, _15, _16, _17.get)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column uuid SqlType(uuid), PrimaryKey */
    val uuid: Rep[java.util.UUID] = column[java.util.UUID]("uuid", O.PrimaryKey)
    /** Database column create_date SqlType(timestamp), Default(None) */
    val createDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("create_date", O.Default(None))
    /** Database column update_date SqlType(timestamp), Default(None) */
    val updateDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("update_date", O.Default(None))
    /** Database column name SqlType(varchar), Length(25,true) */
    val name: Rep[String] = column[String]("name", O.Length(25,varying=true))
    /** Database column gprs_connection_time SqlType(int4), Default(None) */
    val gprsConnectionTime: Rep[Option[Int]] = column[Option[Int]]("gprs_connection_time", O.Default(None))
    /** Database column gprs_running_mode SqlType(int4), Default(None) */
    val gprsRunningMode: Rep[Option[Int]] = column[Option[Int]]("gprs_running_mode", O.Default(None))
    /** Database column gprs_secure_mode SqlType(bool), Default(None) */
    val gprsSecureMode: Rep[Option[Boolean]] = column[Option[Boolean]]("gprs_secure_mode", O.Default(None))
    /** Database column gprs_wake_up_period SqlType(int4), Default(None) */
    val gprsWakeUpPeriod: Rep[Option[Int]] = column[Option[Int]]("gprs_wake_up_period", O.Default(None))
    /** Database column listening_duration SqlType(int4), Default(None) */
    val listeningDuration: Rep[Option[Int]] = column[Option[Int]]("listening_duration", O.Default(None))
    /** Database column wm_bus_mode_type SqlType(int4), Default(None) */
    val wmBusModeType: Rep[Option[Int]] = column[Option[Int]]("wm_bus_mode_type", O.Default(None))
    /** Database column wm_bus_frame_length SqlType(int4), Default(None) */
    val wmBusFrameLength: Rep[Option[Int]] = column[Option[Int]]("wm_bus_frame_length", O.Default(None))
    /** Database column number_of_meters SqlType(int4), Default(None) */
    val numberOfMeters: Rep[Option[Int]] = column[Option[Int]]("number_of_meters", O.Default(None))
    /** Database column reject_meter_already_memorised SqlType(bool), Default(None) */
    val rejectMeterAlreadyMemorised: Rep[Option[Boolean]] = column[Option[Boolean]]("reject_meter_already_memorised", O.Default(None))
    /** Database column manufacturer_id_filtering SqlType(varchar), Length(255,true), Default(None) */
    val manufacturerIdFiltering: Rep[Option[String]] = column[Option[String]]("manufacturer_id_filtering", O.Length(255,varying=true), O.Default(None))
    /** Database column serial_number_filtering SqlType(varchar), Length(2048,true), Default(None) */
    val serialNumberFiltering: Rep[Option[String]] = column[Option[String]]("serial_number_filtering", O.Length(2048,varying=true), O.Default(None))
    /** Database column meter_filtering SqlType(bool), Default(None) */
    val meterFiltering: Rep[Option[Boolean]] = column[Option[Boolean]]("meter_filtering", O.Default(None))
    /** Database column department_id SqlType(uuid) */
    val departmentId: Rep[java.util.UUID] = column[java.util.UUID]("department_id")
  }
  /** Collection-like TableQuery object for table Templates */
  lazy val Templates = new TableQuery(tag => new Templates(tag))

  /** Entity class storing rows of table WakeUpCalendarItems
   *  @param uuid Database column uuid SqlType(uuid), PrimaryKey
   *  @param createDate Database column create_date SqlType(timestamp), Default(None)
   *  @param updateDate Database column update_date SqlType(timestamp), Default(None)
   *  @param days Database column days SqlType(int4)
   *  @param hour Database column hour SqlType(int4)
   *  @param isSending Database column is_sending SqlType(bool)
   *  @param configurationId Database column configuration_id SqlType(uuid), Default(None)
   *  @param templateId Database column template_id SqlType(uuid), Default(None) */
  case class WakeUpCalendarItemsRow(uuid: java.util.UUID, createDate: Option[java.sql.Timestamp] = None, updateDate: Option[java.sql.Timestamp] = None, days: Int, hour: Int, isSending: Boolean, configurationId: Option[java.util.UUID] = None, templateId: Option[java.util.UUID] = None)
  /** GetResult implicit for fetching WakeUpCalendarItemsRow objects using plain SQL queries */
  implicit def GetResultWakeUpCalendarItemsRow(implicit e0: GR[java.util.UUID], e1: GR[Option[java.sql.Timestamp]], e2: GR[Int], e3: GR[Boolean], e4: GR[Option[java.util.UUID]]): GR[WakeUpCalendarItemsRow] = GR{
    prs => import prs._
    WakeUpCalendarItemsRow.tupled((<<[java.util.UUID], <<?[java.sql.Timestamp], <<?[java.sql.Timestamp], <<[Int], <<[Int], <<[Boolean], <<?[java.util.UUID], <<?[java.util.UUID]))
  }
  /** Table description of table wake_up_calendar_items. Objects of this class serve as prototypes for rows in queries. */
  class WakeUpCalendarItems(_tableTag: Tag) extends Table[WakeUpCalendarItemsRow](_tableTag, Some("elive-devices"), "wake_up_calendar_items") {
    def * = (uuid, createDate, updateDate, days, hour, isSending, configurationId, templateId) <> (WakeUpCalendarItemsRow.tupled, WakeUpCalendarItemsRow.unapply)
    /** Maps whole row to an option. Useful for outer joins. */
    def ? = (Rep.Some(uuid), createDate, updateDate, Rep.Some(days), Rep.Some(hour), Rep.Some(isSending), configurationId, templateId).shaped.<>({r=>import r._; _1.map(_=> WakeUpCalendarItemsRow.tupled((_1.get, _2, _3, _4.get, _5.get, _6.get, _7, _8)))}, (_:Any) =>  throw new Exception("Inserting into ? projection not supported."))

    /** Database column uuid SqlType(uuid), PrimaryKey */
    val uuid: Rep[java.util.UUID] = column[java.util.UUID]("uuid", O.PrimaryKey)
    /** Database column create_date SqlType(timestamp), Default(None) */
    val createDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("create_date", O.Default(None))
    /** Database column update_date SqlType(timestamp), Default(None) */
    val updateDate: Rep[Option[java.sql.Timestamp]] = column[Option[java.sql.Timestamp]]("update_date", O.Default(None))
    /** Database column days SqlType(int4) */
    val days: Rep[Int] = column[Int]("days")
    /** Database column hour SqlType(int4) */
    val hour: Rep[Int] = column[Int]("hour")
    /** Database column is_sending SqlType(bool) */
    val isSending: Rep[Boolean] = column[Boolean]("is_sending")
    /** Database column configuration_id SqlType(uuid), Default(None) */
    val configurationId: Rep[Option[java.util.UUID]] = column[Option[java.util.UUID]]("configuration_id", O.Default(None))
    /** Database column template_id SqlType(uuid), Default(None) */
    val templateId: Rep[Option[java.util.UUID]] = column[Option[java.util.UUID]]("template_id", O.Default(None))

    /** Foreign key referencing Configurations (database name wake_up_calendar_items_configuration_id_fkey) */
    lazy val configurationsFk = foreignKey("wake_up_calendar_items_configuration_id_fkey", configurationId, Configurations)(r => Rep.Some(r.uuid), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
    /** Foreign key referencing Templates (database name wake_up_calendar_items_template_id_fkey) */
    lazy val templatesFk = foreignKey("wake_up_calendar_items_template_id_fkey", templateId, Templates)(r => Rep.Some(r.uuid), onUpdate=ForeignKeyAction.NoAction, onDelete=ForeignKeyAction.NoAction)
  }
  /** Collection-like TableQuery object for table WakeUpCalendarItems */
  lazy val WakeUpCalendarItems = new TableQuery(tag => new WakeUpCalendarItems(tag))
}
*/
