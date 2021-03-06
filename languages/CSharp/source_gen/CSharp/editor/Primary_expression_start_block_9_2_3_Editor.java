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
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Horizontal;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;

public class Primary_expression_start_block_9_2_3_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_3bwlaq_a(editorContext, node);
  }
  private EditorCell createCollection_3bwlaq_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_3bwlaq_a");
    editorCell.setBig(true);
    editorCell.addEditorCell(this.createConstant_3bwlaq_a0(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_3bwlaq_b0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_3bwlaq_c0(editorContext, node));
    editorCell.addEditorCell(this.createRefNodeList_3bwlaq_d0(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_3bwlaq_e0(editorContext, node));
    return editorCell;
  }
  private EditorCell createConstant_3bwlaq_a0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "[");
    editorCell.setCellId("Constant_3bwlaq_a0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_3bwlaq_b0(EditorContext editorContext, SNode node) {
    SingleRoleCellProvider provider = new Primary_expression_start_block_9_2_3_Editor.Expression_list_1SingleRoleHandler_3bwlaq_b0(node, MetaAdapterFactory.getContainmentLink(0x5f522167449a4486L, 0x94654f30de6e5cecL, 0x70aadf795f703dL, 0x70aadf795f7352L, "Expression_list_1"), editorContext);
    return provider.createCell();
  }
  private class Expression_list_1SingleRoleHandler_3bwlaq_b0 extends SingleRoleCellProvider {
    public Expression_list_1SingleRoleHandler_3bwlaq_b0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(ownerNode, containmentLink, context);
    }
    protected EditorCell createChildCell(SNode child) {
      EditorCell editorCell = super.createChildCell(child);
      installCellInfo(child, editorCell);
      return editorCell;
    }
    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new OldNewCompositeSubstituteInfo(myEditorContext, new SChildSubstituteInfo(editorCell, myOwnerNode, MetaAdapterFactory.getContainmentLink(0x5f522167449a4486L, 0x94654f30de6e5cecL, 0x70aadf795f703dL, 0x70aadf795f7352L, "Expression_list_1"), child), new DefaultChildSubstituteInfo(myOwnerNode, myContainmentLink.getDeclarationNode(), myEditorContext)));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("Expression_list_1");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      EditorCell editorCell = createEmptyCell_internal(myEditorContext, myOwnerNode);

      installCellInfo(null, editorCell);
      return editorCell;
    }
    private EditorCell createEmptyCell_internal(EditorContext editorContext, SNode node) {
      return this.createConstant_3bwlaq_a1a(editorContext, node);
    }
    private EditorCell createConstant_3bwlaq_a1a(EditorContext editorContext, SNode node) {
      EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, " ");
      editorCell.setCellId("Constant_3bwlaq_a1a");
      editorCell.setDefaultText("");
      return editorCell;
    }
  }
  private EditorCell createConstant_3bwlaq_c0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "]");
    editorCell.setCellId("Constant_3bwlaq_c0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNodeList_3bwlaq_d0(EditorContext editorContext, SNode node) {
    AbstractCellListHandler handler = new Primary_expression_start_block_9_2_3_Editor.Rank_specifier_2ListHandler_3bwlaq_d0(node, "Rank_specifier_2", editorContext);
    EditorCell_Collection editorCell = handler.createCells(editorContext, new CellLayout_Horizontal(), false);
    editorCell.setCellId("refNodeList_Rank_specifier_2");
    editorCell.setRole(handler.getElementRole());
    return editorCell;
  }
  private static class Rank_specifier_2ListHandler_3bwlaq_d0 extends RefNodeListHandler {
    public Rank_specifier_2ListHandler_3bwlaq_d0(SNode ownerNode, String childRole, EditorContext context) {
      super(ownerNode, childRole, context, false);
    }
    public SNode createNodeToInsert(EditorContext editorContext) {
      SNode listOwner = super.getOwner();
      return NodeFactoryManager.createNode(listOwner, editorContext, super.getElementRole());
    }
    public EditorCell createNodeCell(EditorContext editorContext, SNode elementNode) {
      EditorCell elementCell = super.createNodeCell(editorContext, elementNode);
      this.installElementCellActions(this.getOwner(), elementNode, elementCell, editorContext);
      return elementCell;
    }
    public EditorCell createEmptyCell(EditorContext editorContext) {
      EditorCell emptyCell = null;
      emptyCell = this.createEmptyCell_internal(editorContext, this.getOwner());
      this.installElementCellActions(super.getOwner(), null, emptyCell, editorContext);
      return emptyCell;
    }
    public EditorCell createEmptyCell_internal(EditorContext editorContext, SNode node) {
      return this.createConstant_3bwlaq_a3a(editorContext, node);
    }
    public void installElementCellActions(SNode listOwner, SNode elementNode, EditorCell elementCell, EditorContext editorContext) {
      if (elementCell.getUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET) == null) {
        elementCell.putUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET, AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET);
        if (elementNode != null) {
          elementCell.setAction(CellActionType.DELETE, new CellAction_DeleteNode(elementNode, CellAction_DeleteNode.DeleteDirection.FORWARD));
          elementCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteNode(elementNode, CellAction_DeleteNode.DeleteDirection.BACKWARD));
        }
        if (elementCell.getSubstituteInfo() == null || elementCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
          elementCell.setSubstituteInfo(new OldNewCompositeSubstituteInfo(myEditorContext, new SChildSubstituteInfo(elementCell, myOwnerNode, MetaAdapterFactory.getContainmentLink(0x5f522167449a4486L, 0x94654f30de6e5cecL, 0x70aadf795f703dL, 0x70aadf795f7353L, "Rank_specifier_2"), elementNode), new DefaultChildSubstituteInfo(myOwnerNode, elementNode, super.getLinkDeclaration(), myEditorContext)));
        }
      }
    }
    private EditorCell createConstant_3bwlaq_a3a(EditorContext editorContext, SNode node) {
      EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, " ");
      editorCell.setCellId("Constant_3bwlaq_a3a");
      editorCell.setDefaultText("");
      return editorCell;
    }
  }
  private EditorCell createRefNode_3bwlaq_e0(EditorContext editorContext, SNode node) {
    SingleRoleCellProvider provider = new Primary_expression_start_block_9_2_3_Editor.Array_initializer_3SingleRoleHandler_3bwlaq_e0(node, MetaAdapterFactory.getContainmentLink(0x5f522167449a4486L, 0x94654f30de6e5cecL, 0x70aadf795f703dL, 0x70aadf795f7354L, "Array_initializer_3"), editorContext);
    return provider.createCell();
  }
  private class Array_initializer_3SingleRoleHandler_3bwlaq_e0 extends SingleRoleCellProvider {
    public Array_initializer_3SingleRoleHandler_3bwlaq_e0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(ownerNode, containmentLink, context);
    }
    protected EditorCell createChildCell(SNode child) {
      EditorCell editorCell = super.createChildCell(child);
      installCellInfo(child, editorCell);
      return editorCell;
    }
    private void installCellInfo(SNode child, EditorCell editorCell) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo(new OldNewCompositeSubstituteInfo(myEditorContext, new SChildSubstituteInfo(editorCell, myOwnerNode, MetaAdapterFactory.getContainmentLink(0x5f522167449a4486L, 0x94654f30de6e5cecL, 0x70aadf795f703dL, 0x70aadf795f7354L, "Array_initializer_3"), child), new DefaultChildSubstituteInfo(myOwnerNode, myContainmentLink.getDeclarationNode(), myEditorContext)));
      }
      if (editorCell.getRole() == null) {
        editorCell.setRole("Array_initializer_3");
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      EditorCell editorCell = createEmptyCell_internal(myEditorContext, myOwnerNode);

      installCellInfo(null, editorCell);
      return editorCell;
    }
    private EditorCell createEmptyCell_internal(EditorContext editorContext, SNode node) {
      return this.createConstant_3bwlaq_a4a(editorContext, node);
    }
    private EditorCell createConstant_3bwlaq_a4a(EditorContext editorContext, SNode node) {
      EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, " ");
      editorCell.setCellId("Constant_3bwlaq_a4a");
      editorCell.setDefaultText("");
      return editorCell;
    }
  }
}
