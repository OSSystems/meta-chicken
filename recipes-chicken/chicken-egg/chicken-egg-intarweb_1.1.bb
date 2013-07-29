SECTION = "devel/chicken"
DESCRIPTION = "A more convenient HTTP library"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://intarweb.meta;md5=7f89d034a36ac9aacda9e4c972172d5f"
DEPENDS_virtclass-cross += "chicken-egg-defstruct-cross chicken-egg-uri-common-cross chicken-egg-base64-cross"
DEPENDS += "chicken-egg-defstruct chicken-egg-uri-common chicken-egg-base64 chicken-egg-defstruct-cross chicken-egg-uri-common-cross chicken-egg-base64-cross"
RDEPENDS_${PN} += "chicken-egg-defstruct chicken-egg-uri-common chicken-egg-base64"

SRC_URI = "http://code.call-cc.org/egg-tarballs/${EGG}/${EGG}-${PV}.tar.gz"

SRC_URI[md5sum] = "02a25eb48fd191541c79e546efcb2826"
SRC_URI[sha256sum] = "bb6ae63a61d44727f411eef931e52ebae4b1558c20a43f3f2f4e7ffe99c9ab75"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross"
