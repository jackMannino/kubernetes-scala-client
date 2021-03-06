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


case class IoK8sApiCoreV1ReplicationControllerCondition (
  /* The last time the condition transitioned from one status to another. */
  lastTransitionTime: Option[IoK8sApimachineryPkgApisMetaV1Time],
  /* A human readable message indicating details about the transition. */
  message: Option[String],
  /* The reason for the condition's last transition. */
  reason: Option[String],
  /* Status of the condition, one of True, False, Unknown. */
  status: String,
  /* Type of replication controller condition. */
  _type: String
)

