package CSharp.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;

public class Argument_block_1_2_2_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_ozbtms_a(editorContext, node);
  }
  private EditorCell createCollection_ozbtms_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_ozbtms_a");
    editorCell.setBig(true);
    editorCell.addEditorCell(this.createConstant_ozbtms_a0(editorContext, node));
    return editorCell;
  }
  private EditorCell createConstant_ozbtms_a0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "out");
    editorCell.setCellId("Constant_ozbtms_a0");
    editorCell.setDefaultText("");
    return editorCell;
  }
}