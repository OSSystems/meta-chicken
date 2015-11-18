SECTION = "devel/chicken"
DESCRIPTION = "Ports on arbitrary memory buffers"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://buffer-ports.meta;md5=bea8ebd863008fe963c031f296c456b9"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/buffer-ports/buffer-ports-${PV}.tar.gz"

SRC_URI[md5sum] = "35f10f8f820fa781d0765e96e1257c51"
SRC_URI[sha256sum] = "99f541020c090a3b8aa90f3e18949e50a5d42ccf9239aa6f966d9ac0e1e2e466"

S = "${WORKDIR}/buffer-ports-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
