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


case class IoK8sApiBatchV1JobStatus (
  /* The number of actively running pods. */
  active: Option[Integer],
  /* Represents time when the job was completed. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. */
  completionTime: Option[IoK8sApimachineryPkgApisMetaV1Time],
  /* The latest available observations of an object's current state. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/ */
  conditions: Option[List[IoK8sApiBatchV1JobCondition]],
  /* The number of pods which reached phase Failed. */
  failed: Option[Integer],
  /* Represents time when the job was acknowledged by the job controller. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. */
  startTime: Option[IoK8sApimachineryPkgApisMetaV1Time],
  /* The number of pods which reached phase Succeeded. */
  succeeded: Option[Integer]
)

