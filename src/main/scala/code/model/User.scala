package code.model

import net.liftweb.mapper._

class User extends MegaProtoUser[User] {
	def getSingleton = User
}

object User extends User with MetaMegaProtoUser[User] {
	override def dbTableName = "users"
}