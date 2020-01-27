package GuitarHero;

import javax.swing.*;
import java.awt.*;

public class TestGuitarHero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			GameCharacter player1 = new GameCharacterSlash();
//			GameCharacter player2 = new GameCharacterHendrix();
//			player1.playGuitar();
//			player2.playGuitar();
//			player1.playSolo();
//			player2.playSolo();
//			player1.change();
//			player1.playGuitar();
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
			ex.printStackTrace();
		}

		DefaultComboBoxModel model = new DefaultComboBoxModel<GameCharacter>();
		model.addElement(new GameCharacterHendrix());
		model.addElement(new GameCharacterSlash());
		model.addElement(new GameCharacterYoung());
		JComboBox cb = new JComboBox(model);
		cb.setRenderer(new CharListCellRenderer());
		int result = JOptionPane.showConfirmDialog(null, cb, "Select a character model from the list below", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

		if (result == JOptionPane.OK_OPTION) {
			GameCharacter c = (GameCharacter) cb.getSelectedItem();
		}


		Player p = new Player(new GameCharacterHendrix());
		p.start();
	}

	public static class CharListCellRenderer extends DefaultListCellRenderer {
		@Override public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
			System.out.println(value);
			super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
			if (value instanceof GameCharacter) {
				GameCharacter gchar = (GameCharacter) value;
				setText(gchar.getName()); }
			return this;
		}
	}
}

