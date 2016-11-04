package CSharp.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;

public class Identifier_4_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_handcn_a(editorContext, node);
  }
  private EditorCell createCollection_handcn_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_handcn_a");
    editorCell.setBig(true);
    editorCell.addEditorCell(this.createConstant_handcn_a0(editorContext, node));
    return editorCell;
  }
  private EditorCell createConstant_handcn_a0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "__arglist");
    editorCell.setCellId("Constant_handcn_a0");
    editorCell.setDefaultText("");
    return editorCell;
  }
}
