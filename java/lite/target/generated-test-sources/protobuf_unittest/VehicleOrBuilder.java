// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/google/protobuf/nested_builders_test.proto

package protobuf_unittest;

public interface VehicleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protobuf_unittest.Vehicle)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>optional .protobuf_unittest.Engine engine = 1;</code>
   * @return Whether the engine field is set.
   */
  boolean hasEngine();
  /**
   * <code>optional .protobuf_unittest.Engine engine = 1;</code>
   * @return The engine.
   */
  protobuf_unittest.Engine getEngine();

  /**
   * <code>repeated .protobuf_unittest.Wheel wheel = 2;</code>
   */
  java.util.List<protobuf_unittest.Wheel> 
      getWheelList();
  /**
   * <code>repeated .protobuf_unittest.Wheel wheel = 2;</code>
   */
  protobuf_unittest.Wheel getWheel(int index);
  /**
   * <code>repeated .protobuf_unittest.Wheel wheel = 2;</code>
   */
  int getWheelCount();
}
