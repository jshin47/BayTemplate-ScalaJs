package bay.driver

import com.github.tminglei.slickpg._

object CustomizedPgDriver extends CustomizedPgDriver

trait CustomizedPgDriver extends ExPostgresDriver
  with PgArraySupport
  with PgDate2Support
  with PgEnumSupport
  with PgRangeSupport
  with PgHStoreSupport
  with PgSearchSupport {

  override val api = new MyAPI {}

  trait MyAPI extends API
    with ArrayImplicits
    with RangeImplicits
    with HStoreImplicits
    with SearchImplicits
    with SearchAssistants
    with DateTimeImplicits
}
