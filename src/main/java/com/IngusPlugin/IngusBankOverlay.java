package com.IngusPlugin;

import com.google.inject.Inject;
import net.runelite.api.widgets.WidgetItem;
import net.runelite.client.ui.FontManager;
import net.runelite.client.ui.overlay.WidgetItemOverlay;
import net.runelite.client.ui.overlay.components.TextComponent;

import java.awt.*;

public class IngusBankOverlay extends WidgetItemOverlay {

    @Inject
    IngusBankOverlay(){
        showOnBank();
    }

    @Override
    public void renderItemOverlay(Graphics2D graphics, int itemId, WidgetItem itemWidget) {
        graphics.setFont(FontManager.getRunescapeSmallFont());
        renderText(graphics, itemWidget.getCanvasBounds(), itemWidget.getIndex());
    }

    private void renderText(Graphics2D graphics, Rectangle bounds, int itemNum){
        final TextComponent textComponent = new TextComponent();
        textComponent.setPosition(new Point(bounds.x - 1, bounds.y + bounds.height - 1));
        textComponent.setColor(Color.MAGENTA);
        textComponent.render(graphics);
    }
}
