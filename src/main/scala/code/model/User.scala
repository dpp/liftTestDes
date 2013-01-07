package code.model

import net.liftweb.mapper._
import net.liftweb.common.Full

class User extends MegaProtoUser[User] {
	def getSingleton = User
}

object User extends User with MetaMegaProtoUser[User] {
	override def dbTableName = "users"

  override def screenWrap = Full(<lift:surround with="default" at="content">
    <lift:bind /></lift:surround>)
  // define the order fields will appear in forms and output
  override def fieldOrder = List(id, firstName, lastName, email,
    locale, timezone, password)

  // comment this line out to require email validations
  override def skipEmailValidation = true
}