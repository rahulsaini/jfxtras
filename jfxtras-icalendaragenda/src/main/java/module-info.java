module jfxtras.icalendaragenda {
    exports jfxtras.scene.control.agenda.icalendar;
    exports jfxtras.scene.control.agenda.icalendar.editors.deleters;
    exports jfxtras.scene.control.agenda.icalendar.editors.revisors;
    exports jfxtras.scene.control.agenda.icalendar.factories;

    requires transitive java.xml;
    requires transitive jfxtras.agenda;
    requires transitive jfxtras.icalendarfx;
}