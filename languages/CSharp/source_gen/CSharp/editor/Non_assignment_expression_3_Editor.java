package CSharp.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.openapi.editor.cells.DefaultSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.OldNewCompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;

public class Non_assignment_expression_3_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_53awww_a(editorContext, node);
  }
  private EditorCell createCollection_53awww_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_53awww_a");
    editorCell.setBig(true);
    editorCell.addEditorCell(this.createRefNode_53awww_a0(editorContext, node));
    return editorCell;
  }
  private EditorCell createRefNode_53awww_a0(EditorContext editorContext, SNode node) {
    SingleRoleCellProvider provider = new Non_assignment_expression_3_Editor.Conditional_expression_1SingleRoleHandler_53awww_a0(node, MetaAdapterFactory.getContainmentLink(0x5f522167449a4486L, 0x94654f30de6e5cecL, 0x70aadf795f7006L, 0x70aadf795f7323L, "Conditional_expression_1"), editorContext);
    return provider.createCell();
  }
  private class Conditional_expression_1SingleRoleHandler_53awww_a0 extends SingleRoleCellProvider {
    public Conditional_expression_1SingleRoleHandler_53awww_a0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(ownerNode, containmentLink, context);
    }
    protected EditorCell createChildCell(SNode child) {
      EditorCell editorCell = super.createChildCell(child);
      installCellInfo(child, editorCell);
      return editorCell;
    }
    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new OldNewCompositeSubstituteInfo(myEditorContext, new SChildSubstituteInfo(editorCell, myOwnerNode, MetaAdapterFactory.getContainmentLink(0x5f522167449a4486L, 0x94654f30de6e5cecL, 0x70aadf795f7006L, 0x70aadf795f7323L, "Conditional_expression_1"), child), new DefaultChildSubstituteInfo(myOwnerNode, myContainmentLink.getDeclarationNode(), myEditorContext)));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("Conditional_expression_1");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      EditorCell editorCell = createEmptyCell_internal(myEditorContext, myOwnerNode);

      installCellInfo(null, editorCell);
      return editorCell;
    }
    private EditorCell createEmptyCell_internal(EditorContext editorContext, SNode node) {
      return this.createConstant_53awww_a0a(editorContext, node);
    }
    private EditorCell createConstant_53awww_a0a(EditorContext editorContext, SNode node) {
      EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, " ");
      editorCell.setCellId("Constant_53awww_a0a");
      editorCell.setDefaultText("");
      return editorCell;
    }
  }
}
