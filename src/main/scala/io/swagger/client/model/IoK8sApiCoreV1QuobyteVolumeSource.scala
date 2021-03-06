/**
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.9.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model


case class IoK8sApiCoreV1QuobyteVolumeSource (
  /* Group to map volume access to Default is no group */
  group: Option[String],
  /* ReadOnly here will force the Quobyte volume to be mounted with read-only permissions. Defaults to false. */
  readOnly: Option[Boolean],
  /* Registry represents a single or multiple Quobyte Registry services specified as a string as host:port pair (multiple entries are separated with commas) which acts as the central registry for volumes */
  registry: String,
  /* User to map volume access to Defaults to serivceaccount user */
  user: Option[String],
  /* Volume is a string that references an already created Quobyte volume by name. */
  volume: String
)

