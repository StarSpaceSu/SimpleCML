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

public class Delegate_definition_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_gd7lrj_a(editorContext, node);
  }
  private EditorCell createCollection_gd7lrj_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_gd7lrj_a");
    editorCell.setBig(true);
    editorCell.addEditorCell(this.createConstant_gd7lrj_a0(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_gd7lrj_b0(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_gd7lrj_c0(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_gd7lrj_d0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_gd7lrj_e0(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_gd7lrj_f0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_gd7lrj_g0(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_gd7lrj_h0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_gd7lrj_i0(editorContext, node));
    return editorCell;
  }
  private EditorCell createConstant_gd7lrj_a0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "delegate");
    editorCell.setCellId("Constant_gd7lrj_a0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_gd7lrj_b0(EditorContext editorContext, SNode node) {
    SingleRoleCellProvider provider = new Delegate_definition_Editor.Return_type_1SingleRoleHandler_gd7lrj_b0(node, MetaAdapterFactory.getContainmentLink(0x5f522167449a4486L, 0x94654f30de6e5cecL, 0x70aadf795f72abL, 0x70aadf795f7557L, "Return_type_1"), editorContext);
    return provider.createCell();
  }
  private class Return_type_1SingleRoleHandler_gd7lrj_b0 extends SingleRoleCellProvider {
    public Return_type_1SingleRoleHandler_gd7lrj_b0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(ownerNode, containmentLink, context);
    }
    protected EditorCell createChildCell(SNode child) {
      EditorCell editorCell = super.createChildCell(child);
      installCellInfo(child, editorCell);
      return editorCell;
    }
    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new OldNewCompositeSubstituteInfo(myEditorContext, new SChildSubstituteInfo(editorCell, myOwnerNode, MetaAdapterFactory.getContainmentLink(0x5f522167449a4486L, 0x94654f30de6e5cecL, 0x70aadf795f72abL, 0x70aadf795f7557L, "Return_type_1"), child), new DefaultChildSubstituteInfo(myOwnerNode, myContainmentLink.getDeclarationNode(), myEditorContext)));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("Return_type_1");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      EditorCell editorCell = createEmptyCell_internal(myEditorContext, myOwnerNode);

      installCellInfo(null, editorCell);
      return editorCell;
    }
    private EditorCell createEmptyCell_internal(EditorContext editorContext, SNode node) {
      return this.createConstant_gd7lrj_a1a(editorContext, node);
    }
    private EditorCell createConstant_gd7lrj_a1a(EditorContext editorContext, SNode node) {
      EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, " ");
      editorCell.setCellId("Constant_gd7lrj_a1a");
      editorCell.setDefaultText("");
      return editorCell;
    }
  }
  private EditorCell createRefNode_gd7lrj_c0(EditorContext editorContext, SNode node) {
    SingleRoleCellProvider provider = new Delegate_definition_Editor.Identifier_2SingleRoleHandler_gd7lrj_c0(node, MetaAdapterFactory.getContainmentLink(0x5f522167449a4486L, 0x94654f30de6e5cecL, 0x70aadf795f72abL, 0x70aadf795f7558L, "Identifier_2"), editorContext);
    return provider.createCell();
  }
  private class Identifier_2SingleRoleHandler_gd7lrj_c0 extends SingleRoleCellProvider {
    public Identifier_2SingleRoleHandler_gd7lrj_c0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(ownerNode, containmentLink, context);
    }
    protected EditorCell createChildCell(SNode child) {
      EditorCell editorCell = super.createChildCell(child);
      installCellInfo(child, editorCell);
      return editorCell;
    }
    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new OldNewCompositeSubstituteInfo(myEditorContext, new SChildSubstituteInfo(editorCell, myOwnerNode, MetaAdapterFactory.getContainmentLink(0x5f522167449a4486L, 0x94654f30de6e5cecL, 0x70aadf795f72abL, 0x70aadf795f7558L, "Identifier_2"), child), new DefaultChildSubstituteInfo(myOwnerNode, myContainmentLink.getDeclarationNode(), myEditorContext)));
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
      return this.createConstant_gd7lrj_a2a(editorContext, node);
    }
    private EditorCell createConstant_gd7lrj_a2a(EditorContext editorContext, SNode node) {
      EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, " ");
      editorCell.setCellId("Constant_gd7lrj_a2a");
      editorCell.setDefaultText("");
      return editorCell;
    }
  }
  private EditorCell createRefNode_gd7lrj_d0(EditorContext editorContext, SNode node) {
    SingleRoleCellProvider provider = new Delegate_definition_Editor.Variant_type_parameter_list_3SingleRoleHandler_gd7lrj_d0(node, MetaAdapterFactory.getContainmentLink(0x5f522167449a4486L, 0x94654f30de6e5cecL, 0x70aadf795f72abL, 0x70aadf795f7559L, "Variant_type_parameter_list_3"), editorContext);
    return provider.createCell();
  }
  private class Variant_type_parameter_list_3SingleRoleHandler_gd7lrj_d0 extends SingleRoleCellProvider {
    public Variant_type_parameter_list_3SingleRoleHandler_gd7lrj_d0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(ownerNode, containmentLink, context);
    }
    protected EditorCell createChildCell(SNode child) {
      EditorCell editorCell = super.createChildCell(child);
      installCellInfo(child, editorCell);
      return editorCell;
    }
    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new OldNewCompositeSubstituteInfo(myEditorContext, new SChildSubstituteInfo(editorCell, myOwnerNode, MetaAdapterFactory.getContainmentLink(0x5f522167449a4486L, 0x94654f30de6e5cecL, 0x70aadf795f72abL, 0x70aadf795f7559L, "Variant_type_parameter_list_3"), child), new DefaultChildSubstituteInfo(myOwnerNode, myContainmentLink.getDeclarationNode(), myEditorContext)));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("Variant_type_parameter_list_3");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      EditorCell editorCell = createEmptyCell_internal(myEditorContext, myOwnerNode);

      installCellInfo(null, editorCell);
      return editorCell;
    }
    private EditorCell createEmptyCell_internal(EditorContext editorContext, SNode node) {
      return this.createConstant_gd7lrj_a3a(editorContext, node);
    }
    private EditorCell createConstant_gd7lrj_a3a(EditorContext editorContext, SNode node) {
      EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, " ");
      editorCell.setCellId("Constant_gd7lrj_a3a");
      editorCell.setDefaultText("");
      return editorCell;
    }
  }
  private EditorCell createConstant_gd7lrj_e0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "(");
    editorCell.setCellId("Constant_gd7lrj_e0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_gd7lrj_f0(EditorContext editorContext, SNode node) {
    SingleRoleCellProvider provider = new Delegate_definition_Editor.Formal_parameter_list_4SingleRoleHandler_gd7lrj_f0(node, MetaAdapterFactory.getContainmentLink(0x5f522167449a4486L, 0x94654f30de6e5cecL, 0x70aadf795f72abL, 0x70aadf795f755aL, "Formal_parameter_list_4"), editorContext);
    return provider.createCell();
  }
  private class Formal_parameter_list_4SingleRoleHandler_gd7lrj_f0 extends SingleRoleCellProvider {
    public Formal_parameter_list_4SingleRoleHandler_gd7lrj_f0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(ownerNode, containmentLink, context);
    }
    protected EditorCell createChildCell(SNode child) {
      EditorCell editorCell = super.createChildCell(child);
      installCellInfo(child, editorCell);
      return editorCell;
    }
    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new OldNewCompositeSubstituteInfo(myEditorContext, new SChildSubstituteInfo(editorCell, myOwnerNode, MetaAdapterFactory.getContainmentLink(0x5f522167449a4486L, 0x94654f30de6e5cecL, 0x70aadf795f72abL, 0x70aadf795f755aL, "Formal_parameter_list_4"), child), new DefaultChildSubstituteInfo(myOwnerNode, myContainmentLink.getDeclarationNode(), myEditorContext)));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("Formal_parameter_list_4");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      EditorCell editorCell = createEmptyCell_internal(myEditorContext, myOwnerNode);

      installCellInfo(null, editorCell);
      return editorCell;
    }
    private EditorCell createEmptyCell_internal(EditorContext editorContext, SNode node) {
      return this.createConstant_gd7lrj_a5a(editorContext, node);
    }
    private EditorCell createConstant_gd7lrj_a5a(EditorContext editorContext, SNode node) {
      EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, " ");
      editorCell.setCellId("Constant_gd7lrj_a5a");
      editorCell.setDefaultText("");
      return editorCell;
    }
  }
  private EditorCell createConstant_gd7lrj_g0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, ")");
    editorCell.setCellId("Constant_gd7lrj_g0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_gd7lrj_h0(EditorContext editorContext, SNode node) {
    SingleRoleCellProvider provider = new Delegate_definition_Editor.Type_parameter_constraints_clauses_5SingleRoleHandler_gd7lrj_h0(node, MetaAdapterFactory.getContainmentLink(0x5f522167449a4486L, 0x94654f30de6e5cecL, 0x70aadf795f72abL, 0x70aadf795f755bL, "Type_parameter_constraints_clauses_5"), editorContext);
    return provider.createCell();
  }
  private class Type_parameter_constraints_clauses_5SingleRoleHandler_gd7lrj_h0 extends SingleRoleCellProvider {
    public Type_parameter_constraints_clauses_5SingleRoleHandler_gd7lrj_h0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(ownerNode, containmentLink, context);
    }
    protected EditorCell createChildCell(SNode child) {
      EditorCell editorCell = super.createChildCell(child);
      installCellInfo(child, editorCell);
      return editorCell;
    }
    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new OldNewCompositeSubstituteInfo(myEditorContext, new SChildSubstituteInfo(editorCell, myOwnerNode, MetaAdapterFactory.getContainmentLink(0x5f522167449a4486L, 0x94654f30de6e5cecL, 0x70aadf795f72abL, 0x70aadf795f755bL, "Type_parameter_constraints_clauses_5"), child), new DefaultChildSubstituteInfo(myOwnerNode, myContainmentLink.getDeclarationNode(), myEditorContext)));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("Type_parameter_constraints_clauses_5");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      EditorCell editorCell = createEmptyCell_internal(myEditorContext, myOwnerNode);

      installCellInfo(null, editorCell);
      return editorCell;
    }
    private EditorCell createEmptyCell_internal(EditorContext editorContext, SNode node) {
      return this.createConstant_gd7lrj_a7a(editorContext, node);
    }
    private EditorCell createConstant_gd7lrj_a7a(EditorContext editorContext, SNode node) {
      EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, " ");
      editorCell.setCellId("Constant_gd7lrj_a7a");
      editorCell.setDefaultText("");
      return editorCell;
    }
  }
  private EditorCell createConstant_gd7lrj_i0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, ";");
    editorCell.setCellId("Constant_gd7lrj_i0");
    editorCell.setDefaultText("");
    return editorCell;
  }
}
