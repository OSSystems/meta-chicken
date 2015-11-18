SECTION = "devel/chicken"
DESCRIPTION = "An implementation of vlists, a functional list-like data structure."
LICENSE = "LGPL-3"
LIC_FILES_CHKSUM = "file://vlist.meta;md5=b6dd028f0cea91d92b914f2de993b67e"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/vlist/vlist-${PV}.tar.gz"

SRC_URI[md5sum] = "9cd2b2f58ed815645e53c4ff89fc73ed"
SRC_URI[sha256sum] = "3a500d5d75a2020b390a38c38dba86d81a45a1ca927f003df976fae00c4ec56f"

S = "${WORKDIR}/vlist-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
