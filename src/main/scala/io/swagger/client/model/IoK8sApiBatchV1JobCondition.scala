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


case class IoK8sApiBatchV1JobCondition (
  /* Last time the condition was checked. */
  lastProbeTime: Option[IoK8sApimachineryPkgApisMetaV1Time],
  /* Last time the condition transit from one status to another. */
  lastTransitionTime: Option[IoK8sApimachineryPkgApisMetaV1Time],
  /* Human readable message indicating details about last transition. */
  message: Option[String],
  /* (brief) reason for the condition's last transition. */
  reason: Option[String],
  /* Status of the condition, one of True, False, Unknown. */
  status: String,
  /* Type of job condition, Complete or Failed. */
  _type: String
)
