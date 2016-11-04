package CSharp.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.openapi.editor.cells.DefaultSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.OldNewCompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;

public class Primary_expression_start_8_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_q9ww3x_a(editorContext, node);
  }
  private EditorCell createCollection_q9ww3x_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_q9ww3x_a");
    editorCell.setBig(true);
    editorCell.addEditorCell(this.createConstant_q9ww3x_a0(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_q9ww3x_b0(editorContext, node));
    return editorCell;
  }
  private EditorCell createConstant_q9ww3x_a0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "base");
    editorCell.setCellId("Constant_q9ww3x_a0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_q9ww3x_b0(EditorContext editorContext, SNode node) {
    SingleRoleCellProvider provider = new Primary_expression_start_8_Editor.Primary_expression_start_block_8_1_1SingleRoleHandler_q9ww3x_b0(node, MetaAdapterFactory.getContainmentLink(0x5f522167449a4486L, 0x94654f30de6e5cecL, 0x70aadf795f7112L, 0x70aadf795f7436L, "Primary_expression_start_block_8_1_1"), editorContext);
    return provider.createCell();
  }
  private class Primary_expression_start_block_8_1_1SingleRoleHandler_q9ww3x_b0 extends SingleRoleCellProvider {
    public Primary_expression_start_block_8_1_1SingleRoleHandler_q9ww3x_b0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(ownerNode, containmentLink, context);
    }
    protected EditorCell createChildCell(SNode child) {
      EditorCell editorCell = super.createChildCell(child);
      installCellInfo(child, editorCell);
      return editorCell;
    }
    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new OldNewCompositeSubstituteInfo(myEditorContext, new SChildSubstituteInfo(editorCell, myOwnerNode, MetaAdapterFactory.getContainmentLink(0x5f522167449a4486L, 0x94654f30de6e5cecL, 0x70aadf795f7112L, 0x70aadf795f7436L, "Primary_expression_start_block_8_1_1"), child), new DefaultChildSubstituteInfo(myOwnerNode, myContainmentLink.getDeclarationNode(), myEditorContext)));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("Primary_expression_start_block_8_1_1");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      EditorCell editorCell = createEmptyCell_internal(myEditorContext, myOwnerNode);

      installCellInfo(null, editorCell);
      return editorCell;
    }
    private EditorCell createEmptyCell_internal(EditorContext editorContext, SNode node) {
      return this.createConstant_q9ww3x_a1a(editorContext, node);
    }
    private EditorCell createConstant_q9ww3x_a1a(EditorContext editorContext, SNode node) {
      EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, " ");
      editorCell.setCellId("Constant_q9ww3x_a1a");
      editorCell.setDefaultText("");
      return editorCell;
    }
  }
}
