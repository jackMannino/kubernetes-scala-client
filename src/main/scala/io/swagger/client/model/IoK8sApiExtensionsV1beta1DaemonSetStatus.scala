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


case class IoK8sApiExtensionsV1beta1DaemonSetStatus (
  /* Count of hash collisions for the DaemonSet. The DaemonSet controller uses this field as a collision avoidance mechanism when it needs to create the name for the newest ControllerRevision. */
  collisionCount: Option[Integer],
  /* The number of nodes that are running at least 1 daemon pod and are supposed to run the daemon pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/ */
  currentNumberScheduled: Integer,
  /* The total number of nodes that should be running the daemon pod (including nodes correctly running the daemon pod). More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/ */
  desiredNumberScheduled: Integer,
  /* The number of nodes that should be running the daemon pod and have one or more of the daemon pod running and available (ready for at least spec.minReadySeconds) */
  numberAvailable: Option[Integer],
  /* The number of nodes that are running the daemon pod, but are not supposed to run the daemon pod. More info: https://kubernetes.io/docs/concepts/workloads/controllers/daemonset/ */
  numberMisscheduled: Integer,
  /* The number of nodes that should be running the daemon pod and have one or more of the daemon pod running and ready. */
  numberReady: Integer,
  /* The number of nodes that should be running the daemon pod and have none of the daemon pod running and available (ready for at least spec.minReadySeconds) */
  numberUnavailable: Option[Integer],
  /* The most recent generation observed by the daemon set controller. */
  observedGeneration: Option[Long],
  /* The total number of nodes that are running updated daemon pod */
  updatedNumberScheduled: Option[Integer]
)

