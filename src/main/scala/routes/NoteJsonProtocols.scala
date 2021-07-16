package routes

import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport
import spray.json.DefaultJsonProtocol

import models.Note

trait NoteJsonProtocols extends SprayJsonSupport with DefaultJsonProtocol {
  implicit val noteFormat = jsonFormat2(Note)
}
