package controllers


import play.api._
import play.api.mvc._

import play.api.libs.json._
import play.api.libs.iteratee._

import play.api.libs.concurrent.Execution.Implicits._

import models._


object Application extends Controller {
  
  def index = Action {  implicit request =>
    Ok(views.html.index("", Dashboard.checkedIn, Dashboard.motdMessage))
  }
  
  def checkin(email:String) = Action {
     Dashboard.join(email)
     Ok("checkedin")
   }
   
  def checkout(email:String) = Action {
     Dashboard.quit(email)
     Ok("checkedout")
  }

  def listen() = WebSocket.async[JsValue] { request  =>
    Dashboard.listen()
  }
  
}