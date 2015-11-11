SECTION = "devel/chicken"
DESCRIPTION = "Functional arrays and sets"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://arrays.meta;md5=4006c8a428240859f11f54b6e8e8cc9f"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/arrays/arrays-${PV}.tar.gz"

SRC_URI[md5sum] = "6bfcbc8fa29a871e47cd9ab39028e9ef"
SRC_URI[sha256sum] = "94fe71b8f9f858e026d88de71756658bc7c8b7ac3ede8f3933c363cfc03bf381"

S = "${WORKDIR}/${EGG}-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
