package dev.britto.pdf_viewer_plugin;

import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;

/**
 * A Flutter plugin for rendering PDF files using the v2 embedding API.
 */
public class PdfViewerPlugin implements FlutterPlugin {
  /**
   * Default constructor for the PdfViewerPlugin.
   */
  public PdfViewerPlugin() {}

  /**
   * Called when the plugin is attached to the Flutter engine.
   * Registers the PDF viewer factory with the platform view registry.
   *
   * @param binding The FlutterPluginBinding providing access to the engine.
   */
  @Override
  public void onAttachedToEngine(FlutterPluginBinding binding) {
    BinaryMessenger messenger = binding.getBinaryMessenger();
    binding
        .getPlatformViewRegistry()
        .registerViewFactory(
            "pdf_viewer_plugin", new PdfViewerFactory(messenger, /*containerView=*/ null));
  }

  /**
   * Called when the plugin is detached from the Flutter engine.
   * No cleanup is required for this plugin.
   *
   * @param binding The FlutterPluginBinding providing access to the engine.
   */
  @Override
  public void onDetachedFromEngine(FlutterPluginBinding binding) {
    // No cleanup needed
  }
}