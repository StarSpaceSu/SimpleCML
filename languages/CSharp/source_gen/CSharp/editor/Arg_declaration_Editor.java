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

public class Arg_declaration_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_fp2r0t_a(editorContext, node);
  }
  private EditorCell createCollection_fp2r0t_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_fp2r0t_a");
    editorCell.setBig(true);
    editorCell.addEditorCell(this.createRefNode_fp2r0t_a0(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_fp2r0t_b0(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_fp2r0t_c0(editorContext, node));
    return editorCell;
  }
  private EditorCell createRefNode_fp2r0t_a0(EditorContext editorContext, SNode node) {
    SingleRoleCellProvider provider = new Arg_declaration_Editor.Type_1SingleRoleHandler_fp2r0t_a0(node, MetaAdapterFactory.getContainmentLink(0x5f522167449a4486L, 0x94654f30de6e5cecL, 0x70aadf795f700cL, 0x70aadf795f732dL, "Type_1"), editorContext);
    return provider.createCell();
  }
  private class Type_1SingleRoleHandler_fp2r0t_a0 extends SingleRoleCellProvider {
    public Type_1SingleRoleHandler_fp2r0t_a0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(ownerNode, containmentLink, context);
    }
    protected EditorCell createChildCell(SNode child) {
      EditorCell editorCell = super.createChildCell(child);
      installCellInfo(child, editorCell);
      return editorCell;
    }
    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new OldNewCompositeSubstituteInfo(myEditorContext, new SChildSubstituteInfo(editorCell, myOwnerNode, MetaAdapterFactory.getContainmentLink(0x5f522167449a4486L, 0x94654f30de6e5cecL, 0x70aadf795f700cL, 0x70aadf795f732dL, "Type_1"), child), new DefaultChildSubstituteInfo(myOwnerNode, myContainmentLink.getDeclarationNode(), myEditorContext)));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("Type_1");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      EditorCell editorCell = createEmptyCell_internal(myEditorContext, myOwnerNode);

      installCellInfo(null, editorCell);
      return editorCell;
    }
    private EditorCell createEmptyCell_internal(EditorContext editorContext, SNode node) {
      return this.createConstant_fp2r0t_a0a(editorContext, node);
    }
    private EditorCell createConstant_fp2r0t_a0a(EditorContext editorContext, SNode node) {
      EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, " ");
      editorCell.setCellId("Constant_fp2r0t_a0a");
      editorCell.setDefaultText("");
      return editorCell;
    }
  }
  private EditorCell createRefNode_fp2r0t_b0(EditorContext editorContext, SNode node) {
    SingleRoleCellProvider provider = new Arg_declaration_Editor.Identifier_2SingleRoleHandler_fp2r0t_b0(node, MetaAdapterFactory.getContainmentLink(0x5f522167449a4486L, 0x94654f30de6e5cecL, 0x70aadf795f700cL, 0x70aadf795f732eL, "Identifier_2"), editorContext);
    return provider.createCell();
  }
  private class Identifier_2SingleRoleHandler_fp2r0t_b0 extends SingleRoleCellProvider {
    public Identifier_2SingleRoleHandler_fp2r0t_b0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(ownerNode, containmentLink, context);
    }
    protected EditorCell createChildCell(SNode child) {
      EditorCell editorCell = super.createChildCell(child);
      installCellInfo(child, editorCell);
      return editorCell;
    }
    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new OldNewCompositeSubstituteInfo(myEditorContext, new SChildSubstituteInfo(editorCell, myOwnerNode, MetaAdapterFactory.getContainmentLink(0x5f522167449a4486L, 0x94654f30de6e5cecL, 0x70aadf795f700cL, 0x70aadf795f732eL, "Identifier_2"), child), new DefaultChildSubstituteInfo(myOwnerNode, myContainmentLink.getDeclarationNode(), myEditorContext)));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("Identifier_2");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      EditorCell editorCell = createEmptyCell_internal(myEditorContext, myOwnerNode);

      installCellInfo(null, editorCell);
      return editorCell;
    }
    private EditorCell createEmptyCell_internal(EditorContext editorContext, SNode node) {
      return this.createConstant_fp2r0t_a1a(editorContext, node);
    }
    private EditorCell createConstant_fp2r0t_a1a(EditorContext editorContext, SNode node) {
      EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, " ");
      editorCell.setCellId("Constant_fp2r0t_a1a");
      editorCell.setDefaultText("");
      return editorCell;
    }
  }
  private EditorCell createRefNode_fp2r0t_c0(EditorContext editorContext, SNode node) {
    SingleRoleCellProvider provider = new Arg_declaration_Editor.Arg_declaration_block_1_1_3SingleRoleHandler_fp2r0t_c0(node, MetaAdapterFactory.getContainmentLink(0x5f522167449a4486L, 0x94654f30de6e5cecL, 0x70aadf795f700cL, 0x70aadf795f732fL, "Arg_declaration_block_1_1_3"), editorContext);
    return provider.createCell();
  }
  private class Arg_declaration_block_1_1_3SingleRoleHandler_fp2r0t_c0 extends SingleRoleCellProvider {
    public Arg_declaration_block_1_1_3SingleRoleHandler_fp2r0t_c0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(ownerNode, containmentLink, context);
    }
    protected EditorCell createChildCell(SNode child) {
      EditorCell editorCell = super.createChildCell(child);
      installCellInfo(child, editorCell);
      return editorCell;
    }
    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new OldNewCompositeSubstituteInfo(myEditorContext, new SChildSubstituteInfo(editorCell, myOwnerNode, MetaAdapterFactory.getContainmentLink(0x5f522167449a4486L, 0x94654f30de6e5cecL, 0x70aadf795f700cL, 0x70aadf795f732fL, "Arg_declaration_block_1_1_3"), child), new DefaultChildSubstituteInfo(myOwnerNode, myContainmentLink.getDeclarationNode(), myEditorContext)));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("Arg_declaration_block_1_1_3");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      EditorCell editorCell = createEmptyCell_internal(myEditorContext, myOwnerNode);

      installCellInfo(null, editorCell);
      return editorCell;
    }
    private EditorCell createEmptyCell_internal(EditorContext editorContext, SNode node) {
      return this.createConstant_fp2r0t_a2a(editorContext, node);
    }
    private EditorCell createConstant_fp2r0t_a2a(EditorContext editorContext, SNode node) {
      EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, " ");
      editorCell.setCellId("Constant_fp2r0t_a2a");
      editorCell.setDefaultText("");
      return editorCell;
    }
  }
}
