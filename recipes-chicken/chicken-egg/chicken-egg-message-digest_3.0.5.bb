SECTION = "devel/chicken"
DESCRIPTION = "Message Digest Support"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://message-digest.meta;md5=2acf61404c236ac9c498a3b96b99734e"
DEPENDS_virtclass-cross += "chicken-egg-setup-helper-cross chicken-egg-miscmacros-cross chicken-egg-check-errors-cross chicken-egg-variable-item-cross chicken-egg-blob-utils-cross chicken-egg-string-utils-cross"
DEPENDS += "chicken-egg-setup-helper chicken-egg-miscmacros chicken-egg-check-errors chicken-egg-variable-item chicken-egg-blob-utils chicken-egg-string-utils chicken-egg-setup-helper-cross chicken-egg-miscmacros-cross chicken-egg-check-errors-cross chicken-egg-variable-item-cross chicken-egg-blob-utils-cross chicken-egg-string-utils-cross"
RDEPENDS_${PN} += "chicken-egg-setup-helper chicken-egg-miscmacros chicken-egg-check-errors chicken-egg-variable-item chicken-egg-blob-utils chicken-egg-string-utils"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "feddd0f2337b897517f9076f21bb5e6f"
SRC_URI[sha256sum] = "b70ffc63bfae566885f42c0cccc6749f14c4e98f1f613f8599c36554e901f3b1"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
