package dev.britto.pdf_viewer_plugin;

import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;

/**
 * PdfViewerPlugin using the new Flutter v2 plugin embedding.
 * 
 * <p>If you need backward compatibility with older Flutter versions (v1 embedding),
 * you should keep or restore the static registerWith(...) method referencing
 * io.flutter.plugin.common.PluginRegistry.Registrar. However, that method will not
 * compile in newer Flutter environments where Registrar no longer exists.
 */
public class PdfViewerPlugin implements FlutterPlugin {

  public PdfViewerPlugin() {
    // Default constructor
  }

  @Override
  public void onAttachedToEngine(FlutterPluginBinding binding) {
    BinaryMessenger messenger = binding.getBinaryMessenger();
    binding
        .getPlatformViewRegistry()
        .registerViewFactory(
            "pdf_viewer_plugin",
            new PdfViewerFactory(messenger, /* containerView= */ null)
        );
  }

  @Override
  public void onDetachedFromEngine(FlutterPluginBinding binding) {
    // Clean up if necessary
  }
}
