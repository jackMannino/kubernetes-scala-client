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


case class IoK8sApiAutoscalingV1HorizontalPodAutoscalerStatus (
  /* current average CPU utilization over all pods, represented as a percentage of requested CPU, e.g. 70 means that an average pod is using now 70% of its requested CPU. */
  currentCPUUtilizationPercentage: Option[Integer],
  /* current number of replicas of pods managed by this autoscaler. */
  currentReplicas: Integer,
  /* desired number of replicas of pods managed by this autoscaler. */
  desiredReplicas: Integer,
  /* last time the HorizontalPodAutoscaler scaled the number of pods; used by the autoscaler to control how often the number of pods is changed. */
  lastScaleTime: Option[IoK8sApimachineryPkgApisMetaV1Time],
  /* most recent generation observed by this autoscaler. */
  observedGeneration: Option[Long]
)
