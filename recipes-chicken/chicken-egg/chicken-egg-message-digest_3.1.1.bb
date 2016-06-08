SECTION = "devel/chicken"
DESCRIPTION = "Message Digest Support"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://message-digest.meta;md5=790d300b890760ba56bdb6fe3d421661"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross chicken-egg-miscmacros-cross chicken-egg-check-errors-cross chicken-egg-variable-item-cross chicken-egg-blob-utils-cross chicken-egg-string-utils-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-check-errors-crosssdk chicken-egg-variable-item-crosssdk chicken-egg-blob-utils-crosssdk chicken-egg-string-utils-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper nativesdk-chicken-egg-miscmacros nativesdk-chicken-egg-check-errors nativesdk-chicken-egg-variable-item nativesdk-chicken-egg-blob-utils nativesdk-chicken-egg-string-utils chicken-egg-setup-helper-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-check-errors-crosssdk chicken-egg-variable-item-crosssdk chicken-egg-blob-utils-crosssdk chicken-egg-string-utils-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-miscmacros chicken-egg-check-errors chicken-egg-variable-item chicken-egg-blob-utils chicken-egg-string-utils chicken-egg-setup-helper-cross chicken-egg-miscmacros-cross chicken-egg-check-errors-cross chicken-egg-variable-item-cross chicken-egg-blob-utils-cross chicken-egg-string-utils-cross chicken-egg-message-digest-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper chicken-egg-miscmacros chicken-egg-check-errors chicken-egg-variable-item chicken-egg-blob-utils chicken-egg-string-utils"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/message-digest/message-digest-${PV}.tar.gz"

SRC_URI[md5sum] = "fc1ede781c81362ad452e19c348790f4"
SRC_URI[sha256sum] = "aa1787aeab2cb1c2423689e2cd52c0b31a2c3b49894b0d4e4c0064d5eee97a20"

S = "${WORKDIR}/message-digest-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
