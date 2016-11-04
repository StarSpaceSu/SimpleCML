package CSharp.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;

public class Keyword_34_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_hqoa3e_a(editorContext, node);
  }
  private EditorCell createCollection_hqoa3e_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_hqoa3e_a");
    editorCell.setBig(true);
    editorCell.addEditorCell(this.createConstant_hqoa3e_a0(editorContext, node));
    return editorCell;
  }
  private EditorCell createConstant_hqoa3e_a0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "int");
    editorCell.setCellId("Constant_hqoa3e_a0");
    editorCell.setDefaultText("");
    return editorCell;
  }
}
