SECTION = "devel/chicken"
DESCRIPTION = "The null egg"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://null.meta;md5=cf5f35c3dcd02ce7bade652fd01cbd71"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/null/null-${PV}.tar.gz"

SRC_URI[md5sum] = "37b1130efc196eb58501a21d418fb46f"
SRC_URI[sha256sum] = "08c5b75c6686b130f6d9803e59a9560f44bd541a8c95d3322120d99ad77cbcc8"

S = "${WORKDIR}/null-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
